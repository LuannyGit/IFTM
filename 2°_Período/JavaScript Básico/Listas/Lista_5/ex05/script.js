const quantidade = parseInt(prompt("Quantos nomes você deseja inserir?"), 10);

if (!isNaN(quantidade) && quantidade > 0) {
    const nomes = [];

    for (let i = 0; i < quantidade; i++) {
        const nome = prompt(`Digite o ${i + 1}º nome:`);
        nomes.push(nome);
    }

    const container = document.getElementById("lista-nomes");
    let indice = 0;

    const intervalo = setInterval(() => {
        if (indice < nomes.length) {
            const p = document.createElement("p");
            p.className = "nome-item";
            p.textContent = nomes[indice];
            container.appendChild(p);
            indice++;
        } else {
            clearInterval(intervalo); 
        }
    }, 1000);

} else {
    alert("Quantidade inválida informada.");
}