import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagem = scanner.nextDouble();

        System.out.print("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoViagem * velocidadeMedia;
        double consumo = 12; // Automóvel faz 12 km por litro
        double litros = distancia / consumo;

        System.out.println("A quantidade de litros de combustível gasta na viagem é: " + litros);

        scanner.close();
    }
}
