import carros from "./carro.js";

let CARRO_ATUAL = 0;
let idSlideShow;
document.getElementById("imgCarro").addEventListener("mouseover", pauseSlideShow);
document.getElementById("imgCarro").addEventListener("mouseout", playSlideShow);

document.getElementById("tempo").addEventListener("change", function (){
    alert(document.getElementById("tempo").value);
});


function exibirCarro(){
    document.getElementById("imgCarro").src = 'img/'+carros[CARRO_ATUAL].src;
    document.getElementById("nome").innerHTML = carros[CARRO_ATUAL].nome;
    document.getElementById("potencia").innerHTML = carros[CARRO_ATUAL].potencia;
}

function atualizarCarro(){
    exibirCarro();
    if(CARRO_ATUAL < carros.length - 1) CARRO_ATUAL++;
    else CARRO_ATUAL = 0;
    exibirCarro();
}

function pauseSlideShow(){
    clearInterval(idSlideShow);
}

function playSlideShow(){
    idSlideShow = setInterval(atualizarCarro, 1000);

}

function main(){
    exibirCarro();
    playSlideShow();

}
main();

