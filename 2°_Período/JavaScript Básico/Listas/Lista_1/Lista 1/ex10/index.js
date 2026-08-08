numero = prompt("Informe um número positivo: ")
while(numero < 0 || numero == null){
    alert("Informe um número!")
    numero = prompt("Informe um número positivo: ")
}
nome = prompt("Digite seu nome completo: ")

for(i = 0; i < numero; i++){
    document.write(`<p>${nome}</p>`)
}