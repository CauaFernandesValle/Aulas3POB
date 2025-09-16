import java.util.Scanner;

public class E02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        double media, somatorio = 0;
        double[] totalNotas = new double[4];

        for(i = 0; i < 4; i++){

            System.out.println("entre com a " + (i+1) + "° nota: ");
            totalNotas[i]= scanner.nextDouble();

        }

        for(i = 0; i < 4; i++){

            somatorio+=totalNotas[i];

        }

        media = somatorio/4;

        System.out.println("\na media das notas e: " + media);


        scanner.close();
    }

}
