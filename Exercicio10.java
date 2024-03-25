
import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     System.out.print("Digite um numero de 1 a 5: ");
        int numero = scanner.nextInt();


    

        switch (numero) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;

            case 5:
                System.out.println("cinco");
                break;


            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
