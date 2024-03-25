        import java.util.Scanner;


public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 50) {
            System.out.println("seu numero é maior ou igual que 50");

        }


        else{
             System.out.println("seu numero não é maior ou igual que 50");
             }
       
        scanner.close();
    }

}