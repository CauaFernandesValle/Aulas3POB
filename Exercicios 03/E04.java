import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o numero de alunos da turma: ");
        int totalAlunos = scanner.nextInt();
        System.out.println("\n");

        int totalNota = 0;

        for(int i = 0; i < totalAlunos; i++){
            System.out.println("entre com a nota do aluno " + (i+1) + ":");
            totalNota += scanner.nextInt();
        }

        double mediaAlunos = totalNota/(double)totalAlunos;
        System.out.println("\na media das notas dos alunos e " + mediaAlunos);

        scanner.close();
    }
}
