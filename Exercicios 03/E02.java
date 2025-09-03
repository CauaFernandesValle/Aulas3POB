import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scanner.nextInt();

        int resp, i = 1;

        while(i<=10){

            resp = i*num;

            System.out.println(num + "x" + i + "=" + resp);
            i++;

        }
        scanner.close();
    }
}
