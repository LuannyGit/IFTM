const nome = document.getElementById("nome");
const pass = document.getElementById("pass");
const btn = document.getElementById("cadastrar");

btn.addEventListener('click', function(){
    pessoa = {usuario: nome.value, senha: pass.value};
    localStorage.setItem("pessoa", JSON.stringify(pessoa));
})