import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("entre com o x e o y da primeira coordenada: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("entre com o x e o y da segunda coordenada: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        //Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)

        System.out.println("a distancia entre as duas coordenadas é " + distancia);

        scanner.close();
    }
}
