import java.util.Random;
import java.util.Scanner;

public class DescubraNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        int chute = 0;
        int tentativas = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (chute != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            chute = scanner.nextInt();
            tentativas++;

            if (chute < numeroSecreto) {
                System.out.println("O número secreto é maior. Tente novamente!!!");
            } else if (chute > numeroSecreto) {
                System.out.println("O número secreto é menor. Tente novamente!!!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}
