
const nome = document.getElementById('nome');
const pass = document.getElementById('pass');
const btn = document.getElementById('clicar');

btn.addEventListener('click', function () {
    usuarios = JSON.parse(localStorage.getItem("usuarios")) || {info: [
        {usuario: "Luanny", senha: "123"}
    ]};
    usuarioExiste = usuarios.info.some(u => u.usuario === nome.value);
    if(!usuarioExiste){
        usuarios.info.push({
            usuario: nome.value,
            senha: pass.value
        });
        alert("USUÁRIO INEXISTENTE")
        localStorage.setItem("usuarios", JSON.stringify(usuarios));
        alert("Usuário cadastrado com sucesso!");
    }else{
        alert("USUÁRIO JÁ EXISTENTE!")
    }
})


