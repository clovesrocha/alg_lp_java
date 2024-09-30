import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();
        double pi = 3.14;
        double area = pi * raio * raio;

        System.out.println("A área do círculo é: " + area);

    }
}