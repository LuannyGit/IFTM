const nota1 = document.getElementById("nota1")
const nota2 = document.getElementById("nota2")
const resu = document.getElementById("resultado")
const btn = document.getElementById("btnresu")
const comple = document.getElementById("comple")

btn.addEventListener("click", function (){
    let valor = Number(nota1.value) + Number(nota2.value)
    //notaFinal = parseFloat(nota1.value) + parseFloat(nota2.value)
    if(valor >= 60){
        resu.value = "Aprovado"
        alert("APROVADO!")
        alert(`Com um total de ${valor} pontos`)
    }else{
        resu.value = "Reprovado"
        alert("REPROVADO! TOTAL: " + valor + " pontos")
        alert(`Faltando ${100 - valor} pontos para a aprovação`)
    }
})
