package SeisADez;

import java.util.Scanner;

public class SeisADez {

//    6 - Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os números.
//    7 - Escreva um programa que encontre o maior número em um array de inteiros.
//    8 - Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
//    9 - Criar uma calculadora simples de quatro operações (+ - * /).
//    10 - Escreva um programa que ordene um array de números em ordem crescente.


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
}