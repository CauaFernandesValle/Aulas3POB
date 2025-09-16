import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, buscado;
        int[] array = new int[10];
        boolean achou = false;

        for(i=0;i<10;i++){
            System.out.println("entre com um numero: ");
            array[i]= scanner.nextInt();
        }

        System.out.println("\n\nentre com um numero para ser procurado na array: ");
        buscado= scanner.nextInt();

        for(i=0;i<10;i++){
            if(array[i] == buscado){

                if(achou == false){
                    System.out.println("\n\na array armazena o numero " + buscado + " nas posicões: ");
                }
                achou = true;
                System.out.printf("%d ", i);
            }
        }

        if(achou == false){
            System.out.println("\n\nNumero não encontrado.");
        }

        scanner.close();
    }
}

