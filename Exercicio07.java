    import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 100 && numero <200) {
            System.out.println("seu numero está entre 100 e 200");

        }


        else{
             System.out.println("seu numero não está entre 100 e 200");
             }
       
        scanner.close();
    }

}