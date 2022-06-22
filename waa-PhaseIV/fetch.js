$(document).ready(function () {
  $("#view_button").click(function () {
    var url = "https://api.nasa.gov/planetary/apod?api_key=GE5r6C7fP26s1Ta8sSkFkoJtNrvAdddi4FsCj1wS&date="+$("#date").val();   
    fetch(url, {
      method: "GET"      
    })
      .then((res) => {
        return res.json();
      })
      .then((data) => {
        $("#title").html(data.title);
        $("#explanation").html(data.explanation);
        $("#pic").attr("src", data.url);
      })
      .catch(function (error) {      
        console.log("Request failed", error);
        alert(error.responseText);
      });
  });
});

function getAllStudents(){
  var major = document.getElementById("major").value;
  var url = "http://localhost:8080/students/searchByMajor/CS";    
  alert(url)
    fetch(url, {
      method: "GET"      
    })
      .then((res) => {
        return res.json;
      })
      .then((data) => {
        alert(JSON.stringify(data))
        document.getElementById("rs").value = data    
      })
      .catch(function (error) {      
        console.log("Request failed", error);
        alert(error.responseText);
      });
}

function AllCourses(){
  var id = document.getElementById("userId").value;
  var url = "http://localhost:8080/students/courses/search?id="+id;   
  fetch(url, {
    method: "GET"      
  })
    .then((res) => {      
      return res.json();
    })
    .then((data) => {
      alert(JSON.stringify(data))
      document.getElementById("rs").value = JSON.stringify(data)
    })
    .catch(function (error) {
      console.log("Request failed", error);
      alert(error.responseText);
    });
}
