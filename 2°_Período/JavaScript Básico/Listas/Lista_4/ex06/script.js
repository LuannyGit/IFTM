usuarios = {
    info: [
        {usuario: "Luanny", senha: "Lua123"},
        {usuario: "Lulu", senha:"auL321"}
    ]
}

const usuarioJson = JSON.stringify(usuarios);
localStorage.setItem("usuarios", usuarioJson);
document.getElementById("objeto").innerHTML = usuarioJson;
