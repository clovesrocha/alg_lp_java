// Lendo Vetores

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n = 10; // tamanho do vetor
    int v[] = new int[n]; // declaração do vetor "v"
    int i; // índice ou posição

// Entrada de Dados
    for (i=0; i<n; i++) {
      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
      v[i] = ler.nextInt();
    }
