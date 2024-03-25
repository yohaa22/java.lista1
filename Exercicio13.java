import java.util.Scanner;
public class Exercicio13 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o número de A: ");
        double a = scanner.nextDouble();

    System.out.print("Digite o número de B: ");
            double b = scanner.nextDouble();

              System.out.print("Digite a operação: ");
            String c = scanner.next();

            switch (c) {
            case "+":
                System.out.println("o resultado é " + (a + b));
                break;

                 case"-":
                System.out.println("o resultado é " + (a - b));
                break;

             case "*":
                System.out.println("o resultado é " + (a * b));
                break;

                 case "/":
                 if (b != 0) {
                    System.out.println("O resultado é " + (a / b));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;


                  default:
                System.out.println("Operação inválida.");
                break;
            }   
}
}

