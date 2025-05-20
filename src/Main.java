import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import OnzeAQuinze.OnzeAQuinze;
import UmACinco.*;
import SeisADez.*;
import DezesseisADezoito.*;

//    6 - Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os números.
//    7 - Escreva um programa que encontre o maior número em um array de inteiros.
//    8 - Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.
//    9 - Criar uma calculadora simples de quatro operações (+ - * /).
//    10 - Escreva um programa que ordene um array de números em ordem crescente.
//    11 - Escreva um programa que defina uma classe Pessoa com atributos nome e idade, e métodos para exibir esses atributos.
//    12 - Escreva um programa que use herança para criar uma classe Aluno que herda de Pessoa e adiciona um atributo matricula.
//    13 - Escreva um programa que defina uma interface Veiculo com métodos acelerar() e frear(), e implemente essa interface em uma classe Carro.
//    14 - Escreva um programa que solicite um número inteiro e exiba sua tabuada de 1 a 10.
//    15 - Implemente uma calculadora de Índice de Massa Corporal (IMC) que receba peso (kg) e altura (m) e exiba o resultado com a classificação correspondente (ex: abaixo do peso, normal, etc.).
//    16 - Escreva um programa que valide uma senha de acordo com os seguintes critérios:
//      • Pelo menos 8 caracteres
//      • Pelo menos uma letra maiúscula
//      • Pelo menos uma letra minúscula
//      • Pelo menos um número
//    17 - Desenvolva um jogo onde o computador sorteie um número entre 1 e 100, e o usuário tente adivinhá-lo. O programa deve dar dicas ("maior" ou "menor") até o acerto.
//    18 - Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário.

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int opcao;
    do {
        System.out.println("\n========================");
        System.out.println("\n=== Desafio técnicos ===");
        System.out.println("1. Escreva um programa que receba dois números inteiros e exiba a soma deles.");
        System.out.println("2. Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.");
        System.out.println("3. Escreva um programa que calcule a média de três notas fornecidas pelo usuário.");
        System.out.println("4. Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit.");
        System.out.println("5. Escreva um programa que exiba apenas os números pares de 1 a 20.");
        System.out.println("6. Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os números.");
        System.out.println("7. Escreva um programa que encontre o maior número em um array de inteiros.");
        System.out.println("8. Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário.");
        System.out.println("9. Criar uma calculadora simples de quatro operações (+ - * /).");
        System.out.println("10. Escreva um programa que ordene um array de números em ordem crescente.");
        System.out.println("11. Exercícios de 11 a 15 de Criação de Classes.");
        System.out.println("16. Escreva um programa que valide uma senha.");
        System.out.println("17. Desenvolva um jogo onde o computador sorteie um número entre 1 e 100. E o usuário tente adivinhá-lo");
        System.out.println("18. Desenvolva um programa que conte quantas palavras existem em uma string fornecida pelo usuário..");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        switch (opcao) {
            case 1:

                UmACinco.SomaDoisNumeros();
                break;

            case 2:

                UmACinco.VerificaNumero();
                break;

            case 3:

                UmACinco.CalculaMedia();
                break;

            case 4:

                UmACinco.ConversorCtoF();
                break;

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

                // Antes de chamar o contador de vogais, já pedimos a palavra pelo scan
                System.out.print("Digite uma frase ou palavra: ");
                String entrada = scanner.nextLine();

                // Chamamos o contador de vogais passando a palavra como parametro
                int totalVogais = SeisADez.contarVogais(entrada);

                // O contador retorna apenas um inteiro sendo o total de vogais e então printamos
                System.out.println("Total de vogais: " + totalVogais);
                scanner.close();

                break;
            case 9:

                // Chamada da funcao
                SeisADez.calculadoraSimples();
                break;

            case 10:

                int[] arrayEmbaralhado = {42, 7, 13, 5, 99, 1};
                SeisADez.ordenarArrayCrescente(arrayEmbaralhado);
                break;

            case 11:
                // Exercícios de Criação de Classes
                OnzeAQuinze.main();

            case 16:

                DezesseisADezoito.ValidaSenha();
                break;

            case 17:

                DezesseisADezoito.Adivinhador();
                break;

            case 18:
                DezesseisADezoito.ContadorPalavras();
                break;

            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
}

