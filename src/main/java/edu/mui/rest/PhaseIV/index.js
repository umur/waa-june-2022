let URL = "http://127.0.0.1:8080";

async function showStudents() {
  try {
    await fetch(`${URL}/students`, {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
        },
        credentials: "same-origin",
      })
      .then(response => response.json())
      .then(jsonData => {
        let studentsList = document.getElementById("show");
        for (let student of jsonData) {
          let aList = document.createElement("li");
          aList.className = "list-group-item";
          aList.innerHTML = `<b>Id:</b> ${student.id} <b>Name:</b> ${student.firstName} ${student.lastName}</b> <b>Email:</b> ${student.email} <b>Gpa:</b> ${student.gpa} <b>Major:</b> ${student.major}`;
          studentsList.appendChild(aList);
        }
      })
  } catch (err) {
    console.error(err);
  }
}

showStudents();