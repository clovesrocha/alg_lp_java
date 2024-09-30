import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O valor " + valor + " é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor " + valor + " é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }

        scanner.close();
    }
}