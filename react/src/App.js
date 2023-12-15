import axios from 'axios'
export default function Button() {
  const studentApi = "http://localhost:9191/api/student/create";
  const addressApi =  "http://localhost:9191/api/address/create";
  function apiI() {
    console.log('student api call from api gateway'); 
      axios.post(studentApi, { firstName: "Amar", lastName: "Abhishek", email: "abhishek.a@intense.in", addressId: 0
      })
        .then((res) => {
          console.log(":: student api response ",res)
          alert(res.data.message)
        })
        .catch((error) => {
          console.log(error); 
        }) 
  }

  function apiII() {
    console.log('address api call from api gateway'); 
      axios.post(addressApi, { street: "xyz", city: "abv"  })
        .then((res) => {
          console.log(":: address api response ",res)
          alert(res.data.message)
        })
        .catch((error) => {
          console.log(error); 
        }) 
  }

  return (
    <><center><button onClick={apiI}>
       CLICK MICROSERVICE I
    </button><button onClick={apiII}>
     CLICK MICROSERVICE II
      </button></center></>
  );
}