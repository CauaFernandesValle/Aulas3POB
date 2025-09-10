import java.util.Scanner;

public class E12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com tres numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if((num1+num2) > num3 || (num1+num3) > num2 || (num2+num3) > num1){
            System.out.println("nao forma triangulo");
        }else{
            if(num1==num2 && num1==num3){
                System.out.println("triangulo equilatero");
            }else if(num1==num2 || num1==num3 || num2==num3){
                System.out.println("triangulo isósceles");
            }else{
                System.out.println("triangulo escaleno");
            }
        }

        scanner.close();
    }
}
