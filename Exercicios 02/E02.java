import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem: ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("menor de idade");
        }
        
        scanner.close();
    }
}
