import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com um numero de disciplinas em que você não alcançou a media: ");
        int num = scanner.nextInt();

        if(num <= 5){
            System.out.println("Recuperação");
        }else if(num == 0){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        scanner.close();
    }
    
}