import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual ano você nasceu: ");
        int nascimento = scanner.nextInt();
        int idade = 2025 - nascimento;

        System.out.println("entre com o seu gener ['M' para masculino e 'F' para feminino] ");
        char genero = scanner.next().charAt(0);

        genero = Character.toUpperCase(genero);

        if(idade >= 18 && genero =='M'){
            System.out.println("serviço militar obrigatorio");
        }else{
            System.out.println("insento do serviço militar");
        }

        scanner.close();
    }
}
