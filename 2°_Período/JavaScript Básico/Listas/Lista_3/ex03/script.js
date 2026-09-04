const btn = document.getElementById("btnDobrar")
const valor = document.getElementById("valor")
const resu = document.getElementById("resultado")

btn.addEventListener("click", function mostrarDobro(){
    resu.value = valor.value * 2;

})