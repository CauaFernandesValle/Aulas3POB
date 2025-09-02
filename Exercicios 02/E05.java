import java.util.Scanner;

public class E05 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com seu ano de nascimento: ");
        int nascimento = scanner.nextInt();

        int idade = 2025 - nascimento;

        if(idade >= 16){
            System.out.println("Apto a ser eleitor");
        }else{
            System.out.println("Inapto a ser eleitor");
        }

        scanner.close();
    }
}
