window.onload = function () {
    let rowData = document.getElementById("row-Data")
    let mainTable = document.getElementById("mainTable")
    let addForm = document.getElementById("add-form")
    let editButton = document.getElementsByClassName("edit-button");
    let deleteButton = document.getElementsByClassName("delete-button");
    let addButton = document.getElementById("submit");
    let submitForm = document.getElementById('submitForm');

    addForm.style.display = "none";
    mainTable.style.display = "block";
    addButton.style.display = "block";

    async function get() {
        try {
            let response = await fetch("http://localhost:8080/studentsMapperDto");
            let result = await response.json();
            console.log(result);
            if (result != null) {
                for (i = 0; i < result.length; i++) {
                    let courses = "";
                    for (j = 0; j < result[i].courseList.length; j++) {
                        courses += result[i].courseList[j].name + ", ";
                    }
                    courses = courses.slice(0, -2);
                    rowData.innerHTML += `<tr>
                       <td> ${result[i].id}</td>
                        <td>${result[i].firstName}</td>
                        <td>${result[i].lastName}</td>
                        <td>${result[i].email}</td>
                        <td>${result[i].major}</td>
                        <td>${courses}</td>
                        <td> <button class="btn-primary edit-button" id={result[i].id}> Edit</button></td>
                        <td> <button class="btn-warning delete-button"  id={result[i].id} > Delete</button></td>
                    </tr>`
                }
            }
        } catch (e) {
            alert(e);
        }
    }

    get();

    addButton.onclick = function () {
        addForm.style.display = "block";
        mainTable.style.display = "none";
        addButton.style.display = "none";
    };

    submitForm.onclick = function () {
        sendData("http://localhost:8080/studentsMapperDto",modalBinder(),"Post");
    }

    editButton.onclick = function () {
        sendData("http://localhost:8080/studentsMapperDto/4",modalBinder(),"Put");
    }

    deleteButton.onclick = function () {
        sendData(`http://localhost:8080/studentsMapperDto/4`,modalBinder(),"Delete");
    }

    function modalBinder() {
        let courseList = [
            {
                "id": 1,
                "name": "WAA",
                "code": "02"
            },
            {
                "id": 2,
                "name": "MPP",
                "code": "03"
            }
        ]
        let data = {
            "firstName": document.getElementById('firstName').value,
            "lastName": document.getElementById('lastName').value,
            "email": document.getElementById('email').value,
            "major": document.getElementById('major').value,
            "gpa": document.getElementById('gpa').value,
            "coursesTaken": courseList
        }
        return data;
    }

    function sendData(url,data,method) {
        fetch(url, {
            method: method,
            headers: {
                "Content-type": "application/json"
            },
            body: JSON.stringify(data),
        }).then((res) => {
            if (res.status === 200) {
                alert("successful");
            }
        });
    }

}
