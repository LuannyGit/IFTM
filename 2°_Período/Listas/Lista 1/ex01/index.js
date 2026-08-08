primeiroNome = prompt(`Qual o seu primeiro nome? `)



if(primeiroNome != null){
    segundoNome = prompt(`Qual o seu segundo nome? `)
    if(segundoNome != null){
        alert(`Seu nome completo fica:\n${primeiroNome} ${segundoNome}`)
    }
}else {
    while(primeiroNome == null){
    alert(`Você não digitou seu primeiro nome por favor preencha!`)
    primeiroNome = prompt(`Qual o seu primeiro nome? `)
    }
    segundoNome = prompt(`Qual o seu segundo nome? `)
    while(segundoNome == null){
    alert(`Você não digitou seu sobrenome por favor preencha!`)
    segundoNome = prompt(`Qual o seu sobrenome? `)
    }
    
    alert(`Seu nome completo fica:\n${primeiroNome} ${segundoNome}`)
    
}