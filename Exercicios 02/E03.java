import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os dois numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int maior;
        
        if (num1 > num2){
            maior = num1;
        }else{
            maior = num2;
        }

        System.out.println("o maior numero é: " + maior);
        
        scanner.close();
    }
}
