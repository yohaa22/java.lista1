import java.util.Scanner;
public class Exercicio05 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o número de A: ");
        int a = scanner.nextInt();

    System.out.print("Digite o número de B: ");
            int b = scanner.nextInt();



System.out.print("o resultado de A é: '" + a + "' e o resultado de B é'" + b + "'" );

int resul = a;
a = b;
b = resul;

System.out.println("\nValores trocados:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        scanner.close();


}
}