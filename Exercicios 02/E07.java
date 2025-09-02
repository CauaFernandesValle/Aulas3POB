import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com um numero inteiro: ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("Positivo");
        }else if(num == 0){
            System.out.println("Nulo");
        }else{
            System.out.println("Negativo");
        }
        scanner.close();
    }
    
}
