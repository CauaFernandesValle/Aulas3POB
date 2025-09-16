import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int[] array = new int[6];

        for(i=0;i<6;i++){
            System.out.println("entre com um numero: ");
            array[i]= scanner.nextInt();
        }

        for(i=5;i>=0;i--){
            System.out.printf("%d ", array[i]);
        }

        scanner.close();
    }
}
