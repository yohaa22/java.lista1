import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        System.out.print("Digite a primeira nota: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double numero2 = leitor.nextDouble();

        double resultado = (numero1 + numero2) / 2;

        System.out.println("media é: " + resultado);

        if (resultado >= 6) {
            System.out.println("Aprovado");
        } else if (resultado >= 3) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        leitor.close();
    }
}
