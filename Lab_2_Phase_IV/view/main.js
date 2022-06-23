const url = 'http://localhost:8080/students';






function viewall(){
fetch(url ,{
    Method : 'GET'
})
.then(response => response.json())
.then(data=>{
    alert(JSON.stringify(data));
    JSON.stringify(console.log(data));})
.catch(function (error) {      
    console.log("Request failed", error);
    alert(error.responseText);
  });
}


function searchCourses()
{
    var id = document.getElementById("student_id").value;
    var searchurl = 'http://localhost:8080/students/courses/searchById?studentId='+ id;
    console.log(id);
    fetch(searchurl ,{
        Method : 'GET'
    })
    .then(response=> response.json())
    .then(data=>{
        alert(JSON.stringify(data));
        JSON.stringify(console.log(data));})
    .catch(function (error) {      
        console.log("Request failed", error);
        alert(error.responseText);
      });
}