import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira quantos anos você tem: ");
        int anos = scanner.nextInt();
        int dias = anos*365;

        System.out.println("você viveu aproximadamente " + dias + "dias ");

        scanner.close();
    }
}
