nota1 = prompt(`Informe nota do 1° bimestre: `)
nota2 = prompt(`Informe nota do 2° bimestre: `)
resu = parseFloat(nota1) + parseFloat(nota2)
if(resu >= 60){
    alert("Aluno aprovado")
}else{
    alert(`Aluno reprovado\nFaltando ${60 - resu} pontos para ter sido aprovado`)
}