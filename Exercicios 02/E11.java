import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com tres numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if((num1+num2) > num3 || (num1+num3) > num2 || (num2+num3) > num1){
            System.out.println("nao forma triangulo");
        }else{
            System.out.println("forma triangulo");
        }

        scanner.close();
    }
}
