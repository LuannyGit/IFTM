const mensagem = document.getElementById("mensagem")
let tempo  = parseInt(prompt("Introduza o tempo de espera em segundos: "), 10);
if(!isNaN(tempo) && tempo > 0){
    mensagem.textContent = `Por favor, aguarde ${tempo} segundos para carregar a página do Google. `
    const temporizador = setInterval(() => {
        tempo--;
        if(tempo > 0){
            mensagem.textContent = `Por favor, aguarde ${tempo} segundos para carregar a página do Google. `
        }else {
            clearInterval(temporizador);
            window.location.href = "https://www.google.com";
        }
    }, 1000)
}