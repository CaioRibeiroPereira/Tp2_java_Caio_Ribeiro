import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadoraDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do seu nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês do seu nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano do seu nascimento: ");
        int ano = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        LocalDate dataAtual = LocalDate.now();

        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.println("\nVocê tem aproximadamente " + idadeEmDias + " dias de vida.");

        scanner.close();
    }
}
