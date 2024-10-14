/* public class Main {
    public static void main(String[] args) {
       
        int[][] notas = {
            {54, 35, 47},  
            {19, 74, 58},  
            {75, 66, 81}   
        };

       
        String[] estudantes = {"Estudante 1", "Estudante 2", "Estudante 3"};

        
        String[] disciplinas = {"Alg_LP_Java", "UX", "DAD"};

       
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas de " + estudantes[i] + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(disciplinas[j] + ": " + notas[i][j]);
            }
            System.out.println();
        }
    }
}
*/


import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Informe o número de linhas da matriz A:");
        int linhasA = sc.nextInt();
        System.out.println("Informe o número de colunas da matriz A:");
        int colunasA = sc.nextInt();

        
        System.out.println("Informe o número de linhas da matriz B:");
        int linhasB = sc.nextInt();
        System.out.println("Informe o número de colunas da matriz B:");
        int colunasB = sc.nextInt();

        
        if (colunasA != linhasB) {
            System.out.println("Multiplicação não é possível. O número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
            return;
        }

        
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizResultado = new int[linhasA][colunasB];

        
        System.out.println("Informe os valores da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Informe os valores da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizResultado[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        
        System.out.println("Resultado da multiplicação das matrizes:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

       
    }
}
