import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        

          System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();


  int p1 = 5;
  int p2 = 3;
  int p3 = 2;




        double resultado = (((nota1 * p1) + (nota2 * p2) + (nota3 * p3))/ (p1 + p2 + p3));

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