import java.util.Scanner;
public class Exercicio06 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     
   System.out.println("ecreva a temperatura em celcius: ");
 int celcius = scanner.nextInt();

 double fah = celcius * 9 / 5 + 32.1;
System.out.println("o resultado em faehainth é: " + fah);

}
}