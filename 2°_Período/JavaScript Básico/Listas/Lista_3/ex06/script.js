valor1 = document.getElementById('nota1');
valor2 = document.getElementById('nota2');
mais = document.getElementById('mais');
menos = document.getElementById('menos');
multi = document.getElementById('mult');
divi = document.getElementById('divi');
resultado = document.getElementById('resultado');
console.log(valor1.type);
console.log(valor2.value);

mais.addEventListener('click', function () {
    if (valor1.value.trim() == "" || valor2.value.trim() == "") {
        alert("Ambos os campos precisam ser preenchidos!");
    } else {
        resultado.value = Number(valor1.value) + Number(valor2.value);
    }
})
menos.addEventListener('click', function () {
    if (valor1.value.trim() == "" || valor2.value.trim() == "") {
        alert("Ambos os campos precisam ser preenchidos!");
    } else {
        resultado.value = Number(valor1.value) - Number(valor2.value);
    }
})
multi.addEventListener('click', function () {
    if (valor1.value.trim() == "" || valor2.value.trim() == "") {
        alert("Ambos os campos precisam ser preenchidos!");
    } else {
        resultado.value = Number(valor1.value) * Number(valor2.value);
    }
})

divi.addEventListener('click', function () {
    if (valor1.value.trim() == "" || valor2.value.trim() == "") {
        alert("Ambos os campos precisam ser preenchidos!");
    } else {
        if (valor2.value == 0) {
            resultado.value = 'Inválido/0';
        } else {
            resultado.value = Number(valor1.value) / Number(valor2.value);
        }
    }
})


