import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com o seu salario bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.println("entre com seu genero: ['M' para masculino | 'F' para feminino] ");
        char genero = scanner.next().charAt(0);

        double salarioLiquido;
        genero = Character.toUpperCase(genero);

        if(genero == 'M'){
            salarioLiquido = salarioBruto - (salarioBruto * 0.05);
        }else{
            salarioLiquido = salarioBruto - (salarioBruto * 0.03);
        }

        System.out.printf("o seu salario luquido e R$%.2f", salarioLiquido);
        
        scanner.close();
    }
}
