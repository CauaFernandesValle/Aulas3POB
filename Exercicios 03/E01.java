import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero: ");
        int num = scanner.nextInt();

        int i, acumulador = 0;

        for(i = 1; i <= num; i++){
            acumulador += i;
        }

        System.out.println("\na soma dos " + num + " primeiros numero e " + acumulador);

        scanner.close();
    }
}
