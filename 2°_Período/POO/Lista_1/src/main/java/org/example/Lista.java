package org.example;
import java.util.Scanner;

public class Lista {


    public static int exe1(){
        int a = ler(1);
        int b = ler(2);

        return exibir1(a,b);
    }

    public static int ler(int num) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o " + num + "° número: ");
        int n = s.nextInt();
        return n;
    }

    public static int exibir1(int n, int m){
        int maior = 0;
        if (n >= m) {
            System.out.println("O número " + n + " é maior que " + m + ".");
            maior = n;
        } else  if (n == m) {
            System.out.println("Os números " + n + " e " + m + " são iguais.");
            maior = m;
        } else {
            System.out.println("O número "+m+" é maior. ");
            maior = m;
        }
        return maior;
    }

    public static void exe2() {
        Scanner s = new Scanner(System.in);

        double a = ler2(1);

        while (a == 0) {
            System.out.println("O coeficiente 'a' deve ser diferente de 0 para ser uma equação do 2º grau.");
            a = ler2( 1);
        }

        double b = ler2( 2);
        double c = ler2( 3);

        double delta = raizSegundoGrau(a, b, c);
        exibir2(a, b, delta);
    }

    public static double ler2(double num) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite o %.0f° número: ", num);
        double n = s.nextDouble();
        return n;
    }

    public static double raizSegundoGrau(double a, double b, double c){
        return (b * b) - (4 * a * c);
    }

    public static void exibir2(double a, double b, double delta) {
        System.out.println("\n--- Resultado ---");
        System.out.printf("Delta (Δ) = %.2f\n", delta);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("A equação possui uma única raiz real: x = %.2f\n", x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        }
    }

    public static int exe3(){
        int a = ler(1);
        int b = ler(2);
        double conta = mediaAritmetica(a, b);
        exibir3(conta);
        return a;
    }

    public static double mediaAritmetica(double nu, double aa){
        double media = (nu + aa) / 2;
        return media;
    }

    public static double exibir3(double resulta){
        System.out.println("A média é "+resulta);
        return resulta;
    }

    public static void exe4() {
        double a = ler2(1);
        double b = ler2(2);
        double c = ler2(3);

        String resu = "";

        if (a + b <= c || a + c <= b || b + c <= a) {
            resu = "Não é triângulo";
        } else {
            if (a == b && b == c) {
                resu = "Equilátero";
            } else if (a == b || a == c || b == c) {
                resu = "Isósceles";
            } else {
                resu = "Escaleno";
            }
        }

        exibir4(resu);
    }

    public static void exibir4(String resultado){
        System.out.println("O tipo do triângulo é: " + resultado);
    }

    public static void exe5() {

        int numero;
        int[] dados = {0, 0, 0};

        do {
            numero = ler(1);

            if (numero != 0) {
                verificarSoma(numero, dados);
            }

        } while (numero != 0);

        exibir5(dados);
    }

    public static void verificarSoma(int numero, int[] dados) {

        dados[0] += numero;

        if (dados[0] >= 0) {
            dados[1]++;
        } else {
            dados[2]++;
        }
    }

    public static void exibir5(int[] dados) {
        System.out.println("Somas positivas = " + dados[1]);
        System.out.println("Somas negativas = " + dados[2]);
    }

    public static void exe6() {
        Scanner s = new Scanner(System.in);
        String op;

        do {
            int numero = ler(1);

            fatores(numero);

            op = pergunta();

        } while (op.equalsIgnoreCase("s"));
    }

    public static int fatores(int numero){
        System.out.println("Fatores do número "+numero+": ");
        for(int i = 0; i <= numero; i++){
            if (numero % i == 0){
                System.out.println(i + " ");
            }
        }
        System.out.println();
        return numero;
    }

    public static String pergunta(){
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja digitar novamente? (S/N): ");
        return s.nextLine();
    }

    public static void exe7() {
        Scanner s = new Scanner(System.in);

        int quanti = 0;

        int qpar = 0;
        int spar = 0;

        int qimpar = 0;
        int simpar = 0;

        int qposi = 0;
        int sposi = 0;

        int qnega = 0;
        int snega = 0;

        int a;

        do {
            System.out.println("Digite um número (0 para encerrar): ");
            a = s.nextInt();

            // O zero apenas encerra, não entra nos cálculos
            if (a != 0) {
                quanti++;

                if (quantidadePar(a) == 1) {
                    qpar++;
                    spar += somaPar(a);
                }

                if (quantidadeImpar(a) == 1) {
                    qimpar++;
                    simpar += somaImpar(a);
                }

                if (quantidadePosi(a) == 1) {
                    qposi++;
                    sposi += somaPosi(a);
                }

                if (quantidadeNega(a) == 1) {
                    qnega++;
                    snega += somaNega(a);
                }
            }

        } while (a != 0);

        int soma = spar + simpar;

        System.out.println(" ---- RESULTADO ---- ");
        System.out.println("Quantidade de números no total: " + quanti);
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Quantidade de números pares: " + qpar);
        System.out.println("Soma de números pares: " + spar);
        System.out.println("Quantidade de números ímpares: " + qimpar);
        System.out.println("Soma de números ímpares: " + simpar);
        System.out.println("Quantidade de números positivos: " + qposi);
        System.out.println("Soma de números positivos: " + sposi);
        System.out.println("Quantidade de números negativos: " + qnega);
        System.out.println("Soma de números negativos: " + snega);
    }

    public static int quantidadePar(int num) {
        int quantPar = 0;

        if (num % 2 == 0) {
            quantPar++;
        }

        return quantPar;
    }

    public static int somaPar(int num) {
        int soma = 0;

        if (num % 2 == 0) {
            soma += num;
        }

        return soma;
    }

    public static int quantidadeImpar(int num) {
        int quantImpar = 0;

        if (num % 2 != 0) {
            quantImpar++;
        }

        return quantImpar;
    }

    public static int somaImpar(int num) {
        int somaImpar = 0;

        if (num % 2 != 0) {
            somaImpar += num;
        }

        return somaImpar;
    }

    public static int quantidadePosi(int num) {
        int quantPosi = 0;

        if (num > 0) {
            quantPosi++;
        }

        return quantPosi;
    }

    public static int somaPosi(int num) {
        int somaPosi = 0;

        if (num > 0) {
            somaPosi += num;
        }

        return somaPosi;
    }

    public static int quantidadeNega(int num) {
        int quantNega = 0;

        if (num < 0) {
            quantNega++;
        }

        return quantNega;
    }

    public static int somaNega(int num) {
        int somaNega = 0;

        if (num < 0) {
            somaNega += num;
        }

        return somaNega;
    }

    public static void exe8(){
        double numero = ler2(1);

        if (calculoPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }

    public static boolean calculoPrimo(double n){
        if(n < 2)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void exe9(){
        int numero = ler(1);
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static int fatorial(int num) {
        int resultado = 1;

        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void exe10() {
        int a = ler(1);
        int b = ler(2);

        while (a <= 0 || b <= 0) {
            System.out.println("Os números devem ser maiores que zero.");

            a = ler(1);
            b = ler(2);
        }

        int resultado = calcularMMC(a, b);

        System.out.println("O MMC de " + a + " e " + b + " é: " + resultado);
    }

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }

    public static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("---------------MENU LISTA---------------");
        System.out.println("1.  1° exercício");
        System.out.println("2.  2° exercício");
        System.out.println("3.  3° exercício");
        System.out.println("4.  4° exercício");
        System.out.println("5.  5° exercício");
        System.out.println("6.  6° exercício");
        System.out.println("7.  7° exercício");
        System.out.println("8.  8° exercício");
        System.out.println("9.  9° exercício");
        System.out.println("10. 10° exercício");
        int op = s.nextInt();
        switch (op){
            case 1: exe1(); break;
            case 2: exe2(); break;
            case 3: exe3(); break;
            case 4: exe4(); break;
            case 5: exe5(); break;
            case 6: exe6(); break;
            case 7: exe7(); break;
            case 8: exe8(); break;
            case 9: exe9(); break;
            case 10: exe10(); break;
            default: break;
        }
       /* do{
            op = Integer.parseInt(JOptionPane.showInputDialog(""));
            switch (op){
                case 1: exe1();
            }while (op !=17);

        }
        */
    }
}

