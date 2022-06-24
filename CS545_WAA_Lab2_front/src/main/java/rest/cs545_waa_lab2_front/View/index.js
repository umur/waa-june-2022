
const  coursetable =  document.getElementById("ctn");
const btn = document.getElementById("btn")
window.onload= course;
function course(){
    fetch("https://localhost:2030/courses")
        .then(function (res){
           // return res.json();

            let select  = document.getElementById('course-table');
            res.forEach(function (course){
                const div =document.createElement('div');
                div.innerHTML=course.id;
                div.innerHTML=course.name;
                div.innerHTML=course.code;
                select.appendChild(div);
        })
//         .then(function (course){
//             let select  = document.getElementById('course-table');
//             course.forEach(function (course){
//                 const div =document.createElement('div');
//                 div.innerHTML=course.id;
//                 div.innerHTML=course.name;
//                 div.innerHTML=course.code;
//                 select.appendChild(div);
//             })
//         })
 })
}
btn.addEventListener('click', function(){
    coursetable.innerHTML='';
course();

});