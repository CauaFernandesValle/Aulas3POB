import java.util.Scanner;

public class E04 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scanner.nextInt();

        if(num%2 == 0){
            System.out.println("o numero é par");
        }else{
            System.out.println("o numero é impar");
        }

        scanner.close();
    }
}
