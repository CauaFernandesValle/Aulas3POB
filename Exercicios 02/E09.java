import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre com as suas duas notas:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double media = ((double)num1 + num2)/2;

        System.out.println("sua media é " + media);

        //no exercicio pede media maior ou igual a '7', mas acredito que a intenção era ser '6'
        if(media >= 6){
            System.out.println("aprovado");
        }else if(media < 2){
            System.out.println("reprovado");
        }else{
            System.out.println("entre com a sua terceira nota: ");
            int num3 = scanner.nextInt();
             media = (media + num3)/2;

            if(media >= 6){
                System.out.println("aprovado");
            }else{
                System.out.println("reprovado");
            }
        }
        scanner.close();
    }
}
