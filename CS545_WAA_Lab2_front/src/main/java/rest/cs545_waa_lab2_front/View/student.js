const  coursetable =  document.getElementById("ctn");
const btn = document.getElementById("btn")
window.onload= course;
function course(){
    fetch("https://localhost:2030/students")
        .then(function (res){
            return res.json();
        })
        .then(function (course){
            course.forEach(function (course){
                const div =document.createElement('div');
                div.innerHTML=course;
                coursetable.appendChild(div);
            })
        })
}
btn.addEventListener('click', function(){
    coursetable.innerHTML='';
    course();
})