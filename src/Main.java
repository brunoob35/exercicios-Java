import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import UmACinco.*;
import SeisADez.*;


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opcao;
    do {
        System.out.println("\n========================");
        System.out.println("\n=== Desafio técnicos ===");
        System.out.println("1 - Desafio 5: Escreva um programa que exiba apenas os números pares de 1 a 20.");
        System.out.println("2 - Desafio 6: Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os números.");
        System.out.println("3 - Desafio 7: Escreva um programa que encontre o maior número em um array de inteiros.");
        System.out.println("4 - Desafio 8: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.");
        System.out.println("5 - Desafio 9: Criar uma calculadora simples de quatro operações (+ - * /).");
        System.out.println("6 - Desafio 10: Escreva um programa que ordene um array de números em ordem crescente.");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        switch (opcao) {
            case 5:
                // Aqui a lista de números é passada para a função que vai executar o processo
                List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
                UmACinco.listaPares(lista);
                break;

            case 6:
                // Chamada da funcao
                SeisADez.leNumeros();
                break;

            case 7:
                // Array de números que será passada para a função
                int[] array = {6, 12, 3, 7, 42, 8};
                // Chamada da função, recebendo por parâmetro o array e que retorna apenas o maior da lista e armazena na variável "maior"
                int maior = SeisADez.encontrarMaiorNumero(array);
                // Print do maior número na variável "maior"
                System.out.println("O maior número é: " + maior);
                break;

            case 8:
                //realizarEmprestimo();
                break;
            case 9:
                //listarLivros();
                break;
            case 10:
                //listarEmprestimos();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
}

