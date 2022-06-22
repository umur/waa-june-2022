let BASE_URL = "http://127.0.0.1:8080";

let students = [];

async function getStudents() {
  try {
    // console.log(cookie);
    students = await (
      await fetch(`${BASE_URL}/students`, {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
        },
        credentials: "same-origin",
      })
    ).json();
    generateList();
  } catch (err) {
    console.error(err);
  }
}
getStudents();

let studentsList = document.getElementById("students-list");

function generateList() {
  for (let student of students) {
    let aList = document.createElement("li");
    aList.className = "list-group-item";
    aList.innerHTML = `<b>Id:</b> ${student.id} <b>Name:</b> ${student.firstName} ${student.lastName}</b> <b>Email:</b> ${student.email} <b>Gpa:</b> ${student.gpa} <b>Major:</b> ${student.major}`;
    studentsList.appendChild(aList);
  }
}
