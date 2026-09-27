
const nome = document.getElementById('nome');
const pass = document.getElementById('pass');
const btn = document.getElementById('clicar');

btn.addEventListener('click', function () {
    usuarios = {
        info: [
            { usuario: nome.value, senha: pass.value }
        ]
    }
    localStorage.setItem("usuarios", JSON.stringify(usuarios));
})


