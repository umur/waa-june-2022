
const  coursetable =  document.getElementById("ctn");
const btn = document.getElementById("btn")
window.onload= course;
function course(){
    fetch("https://localhost:2030/courses")
        .then(function (res){
            return res.json();
        })
        .then(function (course){
            course.forEach(function (course){
                const div =document.createElement('div');
                div.innerHTML=course;
                coursetable.appendChild(div);
            })
            alert("get successfully");
            //console.log(course);
        })
}
btn.addEventListener('click', function(){
    coursetable.innerHTML='';
course();
})