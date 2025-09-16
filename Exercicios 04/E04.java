import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int[] array = new int[8];

        for(i=0;i<8;i++){
            System.out.println("entre com um numero: ");
            array[i]= scanner.nextInt();
        }
        
        System.out.println("\nos numeros pares inseridos foram : ");

        for(i=0;i<8;i++){

            if(array[i]%2==0){
                System.out.printf("%d ", array[i]);
            }
        }

        scanner.close();
    }
}