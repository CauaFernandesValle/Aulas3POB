import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os 3 numeros para gerar a media: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;
        double media = (double)soma/3;

        System.out.println("a media dos três numeros é " + media);

        scanner.close();

    }
}
