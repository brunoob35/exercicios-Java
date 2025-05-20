package OnzeAQuinze;

import java.util.Scanner;

/**
 * Classe principal que executa os exercícios de 11 a 15:
 * 11 - Classe Pessoa com atributos e métodos.
 * 12 - Herança com a classe Aluno.
 * 13 - Interface Veiculo e implementação com a classe Carro.
 * 14 - Exibição da tabuada de um número.
 * 15 - Cálculo do IMC com classificação.
 */
public class OnzeAQuinze {

    public static void main() {
        System.out.println("--- Exercício 11: Pessoa ---");
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.exibirInformacoes();

        System.out.println("\n--- Exercício 12: Aluno (herança de Pessoa) ---");
        Aluno aluno = new Aluno("Maria", 20, "202301A");
        aluno.exibirInformacoes();

        System.out.println("\n--- Exercício 13: Interface Veiculo e classe Carro ---");
        Carro carro = new Carro("Fusca");
        carro.acelerar();
        carro.frear();

        System.out.println("\n--- Exercício 14: Tabuada ---");
        Utilitarios.exibirTabuada();

        System.out.println("\n--- Exercício 15: Cálculo do IMC ---");
        Utilitarios.calcularIMC();
    }
}

// ========================= EXERCÍCIO 11 =========================
/**
 * Classe Pessoa com atributos básicos e método para exibir informações.
 * Representa uma pessoa com nome e idade.
 */
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}

// ========================= EXERCÍCIO 12 =========================
/**
 * Classe Aluno que herda de Pessoa e adiciona o atributo matrícula.
 */
class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
    }
}

// ========================= EXERCÍCIO 13 =========================
/**
 * Interface Veiculo com os métodos acelerar e frear.
 * Deve ser implementada por qualquer classe que represente um veículo.
 */
interface Veiculo {
    void acelerar();
    void frear();
}

/**
 * Classe Carro que implementa a interface Veiculo.
 * Representa um veículo do tipo carro com um modelo específico.
 */
class Carro implements Veiculo {
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println(modelo + " está freando.");
    }
}

// ========================= EXERCÍCIO 14 e 15 =========================
/**
 * Classe Utilitários com métodos estáticos auxiliares:
 * - exibirTabuada: recebe número do usuário e imprime a tabuada.
 * - calcularIMC: recebe peso e altura, calcula o IMC e exibe a classificação.
 */
class Utilitarios {
    public static void exibirTabuada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite um número inteiro para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void calcularIMC() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Classificação de acordo com a OMS
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida)");
        }
    }
}
