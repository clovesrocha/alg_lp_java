public class Main {
    public static void main(String[] args) {
        // Matriz de notas
        int[][] notas = {
            {54, 35, 47, 92},  // Notas do estudante 1
            {19, 74, 58, 42},  // Notas do estudante 2
            {75, 66, 81, 13}   // Notas do estudante 3
        };
        
        // Vetor de estudantes
        String[] estudantes = {"Estudante 1", "Estudante 2", "Estudante 3"};
        
        // Vetor de disciplinas
        String[] disciplinas = {"Alg_LP_Java", "UX", "DAD"};
        
        // Exibindo as notas de cada estudante em cada disciplina
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas de " + estudantes[i] + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(disciplinas[j] + ": " + notas[i][j]);
            }
            System.out.println();
        }
    }
}
