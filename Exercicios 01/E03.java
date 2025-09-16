import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius: ");
        double tempC = scanner.nextDouble();

        double tempF = (tempC * (9/5)) + 32;

        System.out.println("a temperatura " + tempC + "°C em Fahrenheit é " + tempF + "°F");

        scanner.close();


    }
}
