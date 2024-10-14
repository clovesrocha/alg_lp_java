import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tamanho das matrizes
        int tamanho = 10;
        
        // Matriz de notas (10 estudantes e 10 disciplinas)
        int[][] notas = new int[tamanho][tamanho];
        
        // Preenchendo a matriz de notas com valores aleatórios
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                notas[i][j] = random.nextInt(101); // Notas entre 0 e 100
            }
        }
        
        // Matriz de estudantes (10 estudantes)
        String[] estudantes = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            estudantes[i] = "Estudante " + (i + 1);
        }
        
        // Matriz de disciplinas (10 disciplinas)
        String[] disciplinas = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            disciplinas[i] = "Disciplina " + (i + 1);
        }
        
        // Exibindo as notas de cada estudante em cada disciplina
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Notas de " + estudantes[i] + ":");
            for (int j = 0; j < tamanho; j++) {
                System.out.println(disciplinas[j] + ": " + notas[i][j]);
            }
            System.out.println();
        }
    }
}
