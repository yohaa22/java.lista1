import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os três valores inteiros
        System.out.print("Digite o primeiro valor inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int numero3 = scanner.nextInt();

        // Ordenar os valores em ordem crescente
        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        if (numero2 > numero3) {
            int temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        // Exibir os valores em ordem crescente
        System.out.println("Os valores em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);

        scanner.close();
    }
}
