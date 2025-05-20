package DezesseisADezoito;

import java.util.Scanner;
import java.util.Random;

public class DezesseisADezoito {

    // QUESTÃO 16 – Validador de Senha
    public static void ValidaSenha(){

        System.out.print("Digite uma senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine(); // Lê a senha digitada pelo usuário

        // Verifica os critérios da senha:
        // - Pelo menos 8 caracteres
        // - Pelo menos uma letra maiúscula
        // - Pelo menos uma letra minúscula
        // - Pelo menos um número
        if (senha.length() >= 8 &&
                senha.matches(".*[A-Z].*") &&
                senha.matches(".*[a-z].*") &&
                senha.matches(".*\\d.*")) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Senha inválida! A senha deve conter:");
            System.out.println("- Pelo menos 8 caracteres");
            System.out.println("- Pelo menos uma letra maiúscula");
            System.out.println("- Pelo menos uma letra minúscula");
            System.out.println("- Pelo menos um número");
        }
    }

    // QUESTÃO 17 – Jogo de Adivinhação

    public static void Adivinhador(){
        Random rand = new Random(); // Criador de número aleatório
        int numeroSecreto = rand.nextInt(100) + 1; // Número aleatório entre 1 e 100
        int tentativa;
        int tentativas = 0;
        int maxTentativas = 7; // Máximo de tentativas permitidas

        System.out.println("Tente adivinhar o número entre 1 e 100.");
        System.out.println("Você tem até " + maxTentativas + " tentativas.");

        // Repete até acertar ou acabar as tentativas
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Tentativa #" + (tentativas + 1) + ": ");
            tentativa = scanner.nextInt(); // Lê o número digitado
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Menor!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");
                break; // Sai do laço se acertar
            }

            if (tentativas == maxTentativas) {
                System.out.println("Que pena! Suas tentativas acabaram.");
                System.out.println("O número correto era: " + numeroSecreto);
            }

        } while (tentativas < maxTentativas);

        scanner.nextLine(); // Limpa o buffer (depois de nextInt)
    }


    // QUESTÃO 18 – Contador de Palavras
    public static void ContadorPalavras(){
        System.out.print("Digite uma frase: ");
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine(); // Lê a frase completa

        // Divide a frase usando espaços como separador (pode ser mais de um espaço)
        String[] palavras = frase.trim().split("\\s+");
        System.out.println("A frase contém " + palavras.length + " palavra(s).");

        scanner.close(); // Fecha o scanner para liberar o recurso
    }
}