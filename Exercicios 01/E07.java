import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com a base e depois a altura do retangulo: ");
        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        int area = base*altura;
        int perimetro = 2*(base+altura);

        System.out.println("o perimetro do seu retangulo é " + perimetro + "e a area é " + area);

        scanner.close();
    }
}
