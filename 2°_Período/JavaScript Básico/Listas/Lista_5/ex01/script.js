const caixa1 = document.getElementById("caixa1");
const caixa2 = document.getElementById("caixa2");
caixa1.value = "Isso é um texto";

function trocarCaixa(){
    caixa2.value = caixa1.value;
    caixa1.value = "";
}

document.getElementById("trocar").addEventListener('click', function (){
    setInterval(trocarCaixa, 2000)
});