import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
