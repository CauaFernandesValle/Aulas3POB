import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("entre com o raio da esfera: ");
        int raio = scanner.nextInt();
        double volume = (4/3) * pi * (raio*raio*raio);

        System.out.println("o volume da esfera é " + volume);
        scanner.close();
    }
}
