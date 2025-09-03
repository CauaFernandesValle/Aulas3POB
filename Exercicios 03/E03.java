import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero positivo: ");
        int num = scanner.nextInt();

        do{

            System.out.println(num);
            num--;

        }while(num >= 0);

        scanner.close();
    }
}