const btn = document.getElementById('entrar');
const nome = document.getElementById('nome');

const bemVindo = document.getElementById('bemVindo');
const btnConvidado = document.getElementById('btnConvidado');

const img1 = document.getElementById('felino01');
const img2 = document.getElementById('felino02');
const img3 = document.getElementById('felino03');
const img4 = document.getElementById('felino04');
const numeroSorte = document.getElementById('numeroSorte');
const btnSorte = document.getElementById('btnSorte');
const carinhos = document.getElementById('carinhos');
let contador = 1;
const cocegas = document.getElementById('cocegas');

if(btn){
    alert("Olá, seja bem vindo!")
    btn.addEventListener('click', () => {
        nomeSobrenome(nome.value);
    });
    
    function nomeSobrenome(textoNome) {
        const textoPartido = textoNome.trim().split(" ");
        const palavrasValidas = textoPartido.filter(palavra => palavra !== "");

        if (palavrasValidas.length <= 1) {
            alert("Por favor informar NOME + SOBRENOME");
        }else{
            const primeiroNome = palavrasValidas[0];
            const ultimoSobrenome = palavrasValidas[palavrasValidas.length - 1];
            const nomeFormatado = `${primeiroNome} ${ultimoSobrenome}`;

            localStorage.setItem('usuario', nomeFormatado);
            window.location.href = "menu.html";
        }
    }
}

if(bemVindo){
    const usuarioSalvo = localStorage.getItem('usuario');

    if(usuarioSalvo){
        exibirMensagem(`${usuarioSalvo}, seja bem-vindo ao jogo dos Felinos!`);
    }

}

function exibirMensagem(mensagem){
    bemVindo.style.color = 'green';
    bemVindo.style.fontSize = '25px';
    bemVindo.style.fontWeight = 'bold';
    bemVindo.innerHTML = mensagem;
}

if(btnConvidado){
    btnConvidado.addEventListener('click', () =>{
        window.location.href = "felino.html";
    })
}

img1.addEventListener('click', () => {
    const nomePartido = localStorage.getItem('usuario').split(" ");
    alert(`Oi ${nomePartido[0]}, tudo bem com você? `)
})

img2.addEventListener('click', () => {
    carinhos.innerHTML = `${contador++}`;
})

function alterarGato(event){
    if(event.type === 'mouseover'){
        img3.src = "../Imagens/gato06.gif"
    }else if(event.type === 'mouseout'){
        img3.src = "../Imagens/gato03.gif"
    }
}
img3.addEventListener('mouseover', alterarGato)
img3.addEventListener('mouseout', alterarGato)

const textoIncial = cocegas.innerText;
const TEMPO_ESPERADO = 1000;
img4.addEventListener('mouseenter', () => {
    temporizador = setTimeout(() => {
        cocegas.innerText = "Ai, pare de fazer cócegas!"
    }, TEMPO_ESPERADO)
})

img4.addEventListener('mouseleave', () => {
    clearTimeout(temporizador);
    cocegas.innerText = textoIncial;
})

const numeroAleatorio = Math.floor(Math.random() * 100) + 1;

btnSorte.addEventListener('click', () =>{
    numeroSorte.style.textAlign = 'center';
    numeroSorte.value = numeroAleatorio;
})