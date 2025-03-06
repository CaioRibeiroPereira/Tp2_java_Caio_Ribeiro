import java.util.Scanner;


public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição das taxas de câmbio
        final double TAXA_DOLAR = 5.76;
        final double TAXA_EURO = 6.22;
        final double TAXA_LIBRA = 7.42;

        // Captura do valor em reais
        System.out.print("Digite o valor em reais (R$) (de acordo com esse modelo 00,00):  ");
        double valorReais = scanner.nextDouble();

        // Captura da moeda de destino
        System.out.print("Escolha a moeda de destino (dólar, euro ou libra): ");
        String moeda = scanner.next().toLowerCase();

        double valorConvertido = 0;
        String simboloMoeda = "";


        switch (moeda) {
            case "dólar":
            case "dolar":
                valorConvertido = valorReais / TAXA_DOLAR;
                simboloMoeda = "USD";
                break;
            case "euro":
                valorConvertido = valorReais / TAXA_EURO;
                simboloMoeda = "EUR";
                break;
            case "libra":
                valorConvertido = valorReais / TAXA_LIBRA;
                simboloMoeda = "GBP";
                break;
            default:
                System.out.println("Moeda inválida! Tente novamente.");
                scanner.close();
                return;
        }


        System.out.printf("\nValor convertido: %.2f %s\n", valorConvertido, simboloMoeda);

        scanner.close();
    }
}
