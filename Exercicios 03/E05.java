import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o inicio e fim do intervalo: ");
        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();

        System.out.println("\n");
        boolean primo;

        for(int i = inicio; i<=fim; i++){

            primo = true;

            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    primo = false;
                    break;
                }
            }

            if(primo == true){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}