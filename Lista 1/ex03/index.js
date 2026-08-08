nome = prompt(`Informe seu nome completo: `)
idade = prompt(`Informe sua idade: `)

if(nome == null){
    nome = "FULANO(A)"
}
if(idade <= 0){
    alert(`Idade inválida`)
}else{
    if(idade >= 18){
    alert(`${nome} você já possui idade para tirar a carteira`)
}else{
    alert(`${nome} você ainda não possui idade para tirar a carteira, ainda falta(m) ${18 - idade} anos.`)
}
}
