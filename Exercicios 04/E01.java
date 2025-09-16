import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;
        int[] num = new int[5];
        

        for(i=0;i<5;i++){

            System.out.println("entre com um numero: ");
            num[i] = scanner.nextInt();

        }

        for(i=0;i<5;i++){

            if(num[i] > maior){
                maior = num[i];
            }

            if(num[i] < menor){
                menor = num[i];
            }

        }

        System.out.println("o maior numero inserido e: " + maior + "\no menor numero inserido e: " + menor);

        scanner.close();
    }
}
