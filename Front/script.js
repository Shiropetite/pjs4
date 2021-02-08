let url = 'http://localhost:8080/api/todos';

async function getTodo() {
    const result = await fetch(url);
    const todos = await result.json();
    let todo = document.getElementById('todo');
    todos.forEach(function (task) {
        todo.innerHTML += '<div id="' + task.id + '">' +
        '<p>' +  '<input onchange="' + updateTodo(task.id) + '" type="checkbox" name="isChecked"/>'
        + task.title + " | " + task.description + ' <button type="button" onclick="del(' + task.id + ')"> Supprimer </button> </p>' + 
        '</div>';
    })

}

async function add() {
    const formData = new FormData(document.querySelector('form'))
    var todo = {};
    formData.forEach((value, key) => todo[key] = value);
    var task = JSON.stringify(todo);
    console.log(task)
    fetch(url, {
        method: 'POST', 
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: task
    });
    window.location.reload();
}

async function del(id) {
    try {
        await fetch(url + `/${id}`, {
            method: "DELETE",
        });
    } catch (err) {
    }
    window.location.reload();
}

// Todo
async function updateTodo(id) {
    
}