import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira dois numeros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + (num1 + num2));

        scanner.close();
    }
}
