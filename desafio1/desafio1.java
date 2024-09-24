import java.util.Scanner;

public class Main {

    public static String calcularSituacao(double nota1, double nota2, Double notaFinal) {
        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            return "Aprovado direto!";
        } else if (media >= 4.0) {
            if (notaFinal != null) {
                double mediaFinal = (media + notaFinal) / 2;
                if (mediaFinal >= 5.0) {
                    return "Aprovado na final!";
                } else {
                    return "Reprovado na final!";
                }
            } else {
                double tela = 5.0 - media;
                return String.format("Tela: %.2f para ser aprovado na final!", tela);
            }
        } else {
            return "Reprovado direto!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        String situacao = calcularSituacao(nota1, nota2, null);
        System.out.println(situacao);

        if (situacao.equals("Aprovado na final!") || situacao.contains("para ser aprovado na final")) {
            System.out.print("Final: ");
            double notaFinal = scanner.nextDouble();
            String situacaoFinal = calcularSituacao(nota1, nota2, notaFinal);
            System.out.println(situacaoFinal);
        }
    }
}
