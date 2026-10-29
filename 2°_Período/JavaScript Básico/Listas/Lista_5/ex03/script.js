const nome = document.getElementById("nome")
const texto = document.getElementById("textoExibido")
function nomeGrande(){
    texto.textContent = nome.value;
    let tamanho = 14;
    texto.style.fontSize = tamanho + "px";
    const intervalo = setInterval(() =>{
        tamanho += 2;
        texto.style.fontSize = tamanho + "px";
        if(tamanho >= 40){
            clearInterval(intervalo)
        }
    }, 500);
}

document.getElementById("exibe").addEventListener('click', nomeGrande)