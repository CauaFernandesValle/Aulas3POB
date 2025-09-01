import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com o salario bruto e o valor descontado pro INSS: ");
        double salarioBruto = scanner.nextDouble();
        double descontoINSS = scanner.nextDouble();
        double salarioFinal = salarioBruto - descontoINSS;

        System.out.println("o salario liquido é " + salarioFinal);

        scanner.close();
    }
}
