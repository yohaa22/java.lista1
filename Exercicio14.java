import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o primeiro termo (a1)
        System.out.print("Digite o primeiro termo (a1) da progressão aritmética: ");
        int a1 = scanner.nextInt();

        // Ler a ordem do termo que queremos encontrar (n)
        System.out.print("Digite a ordem do termo que deseja encontrar (n): ");
        int n = scanner.nextInt();

        // Ler a razão da progressão aritmética (r)
        System.out.print("Digite a razão (r) da progressão aritmética: ");
        int r = scanner.nextInt();

        // Calcular o n-ésimo termo (an) usando a fórmula geral
        int an = a1 + (n - 1) * r;

        // Exibir o resultado
        System.out.println("O " + n + "-ésimo termo da progressão aritmética é: " + an);

        scanner.close();
    }
}
