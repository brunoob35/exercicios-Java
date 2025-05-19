package UmACinco;

import java.util.List;

public class UmACinco {

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
