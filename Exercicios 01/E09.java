import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com o valor em real e a cotação do Dolar atual: ");
        double valorEmReal = scanner.nextDouble();
        double cotacaoDolar = scanner.nextDouble();
        double valorEmDolar = valorEmReal/cotacaoDolar;

        System.out.printf("o valor em dolar é US$%.2f", valorEmDolar);

        scanner.close();
    }
}
