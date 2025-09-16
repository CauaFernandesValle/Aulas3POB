import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        
        double pi = 3.14159;
        double raio;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o raio do circulo: ");
        raio = scanner.nextDouble();

        double area = pi * raio;

        System.out.println("a area do circudo de raio " + raio + " é " + area);

        scanner.close();


    }
}
