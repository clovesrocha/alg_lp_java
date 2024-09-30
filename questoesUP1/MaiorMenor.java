import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        boolean primeiroValor = true;
        int valor;

        while (true) {
            System.out.print("Digite um valor positivo (ou negativo para encerrar): ");
            valor = scanner.nextInt();

            if (valor < 0) {
                break;
            }

            if (primeiroValor) {
                maior = valor;
                menor = valor;
                primeiroValor = false;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }

        if (!primeiroValor) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }

        scanner.close();
    }
}