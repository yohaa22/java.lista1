import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double mediaHarmonica = calcularMediaHarmonica(nota1, nota2, nota3);

        System.out.println("A média harmônica das notas é: " + mediaHarmonica);

        scanner.close();
    }

    public static double calcularMediaHarmonica(double nota1, double nota2, double nota3) {
        double inversoNota1 = 1 / nota1;
        double inversoNota2 = 1 / nota2;
        double inversoNota3 = 1 / nota3;

        return 3 / (inversoNota1 + inversoNota2 + inversoNota3);
    }
}
