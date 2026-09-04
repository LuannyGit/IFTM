const btnEntrar = document.getElementById("btnEntrar");
const btnLimpar = document.getElementById("btnLimpar");

btnEntrar.addEventListener("click", function () {

    const login = document.getElementById("login").value;
    const senha = document.getElementById("senha").value;
    const confirmarSenha = document.getElementById("confirmarSenha").value;

    if (login === "") {
        alert("Digite o Login!");
        return;
    }

    if (senha !== confirmarSenha) {

        document.getElementById("senha").value = "";
        document.getElementById("confirmarSenha").value = "";

        alert("As senhas não são iguais!");
        return;
    }

    alert("Todos os campos foram digitados corretamente!");
});


btnLimpar.addEventListener("click", function () {

    document.getElementById("login").value = "";
    document.getElementById("senha").value = "";
    document.getElementById("confirmarSenha").value = "";

});