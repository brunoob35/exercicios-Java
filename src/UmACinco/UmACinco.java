package UmACinco;

import java.util.List;
import java.util.Scanner;

public class UmACinco {

    // 1 - Escreva um programa que receba dois números inteiros e exiba a soma deles
    public static void SomaDoisNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é: " + soma);

        scanner.close();
    }

    // 2 - Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar
    public static void VerificaNumero(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }

    // 3 - Escreva um programa que calcule a média de três notas fornecidas pelo usuário.
    public static void CalculaMedia(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);

        scanner.close();
    }

    // 4 - Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit.
    public static void ConversorCtoF(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
    }

    //    5 - Escreva um programa que exiba apenas os números pares de 1 a 20.
    //Desafio #5: Lista numeros pares
    public static void listaPares(List<Integer> lista) {

        // Faz um loop iterando por todos os números da lista
        for (int numero : lista) {
            // testa se o número é par pelo operador Módulo (%)
            // se o resultado da divisão por 2 não tem resto, é par!
            if (numero % 2 == 0) {
                //printa o numero
                System.out.print(numero + " ");
            }
        }
    }
}
