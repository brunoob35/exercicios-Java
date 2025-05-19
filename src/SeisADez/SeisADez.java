package SeisADez;

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

    public static int encontrarMaiorNumero(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O array está vazio.");
        }

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }
}