package SeisADez;

import java.util.Arrays;
import java.util.Scanner;

public class SeisADez {

    // Desafio #6: lê os números digitados pelo usuário e os imprime
    public static void leNumeros() {
        // Inicializa o scanner e cria a lista que vai armazenar os números digitados
        Scanner scanner = new Scanner(System.in);

        // Questionamos quantos numeros o usuário quer armazenar
        System.out.print("Quantos números você deseja armazenar? ");
        int quantidade = scanner.nextInt();

        // Criamos a lista no tamanho que o usuário informou
        int[] numeros = new int[quantidade];

        // Loop que perguntará ao usuário tantas vezes quantas ele informou e vai acrescentar o valor digitado a lista usando o scanner.NextInt()
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Loop que vai mostrar os números armazenados na Lista para cada número na lista numeros
        System.out.println("\nNúmeros digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Encerramento do Scanner
        scanner.close();
    }

    // Desafio #7: Escreva um programa que encontre o maior número em um array de inteiros.
    public static int encontrarMaiorNumero(int[] numeros) {

        // Inicializa uma nova variável chamada maior que recebe o valor na primeira posição do array de números
        int maior = numeros[0];

        // Loop que percorre a lista por seu .lenght
        for (int i = 1; i < numeros.length; i++) {
            //compara o numero da lista com o valor em maior, se for maior o substitúi
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        // retorna a variavel maior
        return maior;
    }

    // Desafio #8: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
    public static int contarVogais(String texto) {
        // Inicializa uma variavel contador
        int contador = 0;
        // Criamos uma "referencia" das vogais que serão contadas
        String vogais = "aeiouAEIOU";

        // Loopamos para cada letra em texto
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            // Verificando se ela está no index das Vogais, e se o retorno disso for diferente de -1
            if (vogais.indexOf(c) != -1) {
                //o contador recebe +1
                contador++;
            }
        }

        // Retornamos o valor no contador
        return contador;
    }

    // Desafio #9: Criar uma calculadora simples de quatro operações (+ - * /).
    public static void calculadoraSimples() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        String operador = scanner.next();

        double resultado;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }

    // Desafio #10: Escreva um programa que ordene um array de números em ordem crescente.
    public static void ordenarArrayCrescente(int[] numeros) {
        Arrays.sort(numeros); // Ordena o array em ordem crescente

        System.out.println("Array ordenado em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println(); // quebra de linha
    }

}