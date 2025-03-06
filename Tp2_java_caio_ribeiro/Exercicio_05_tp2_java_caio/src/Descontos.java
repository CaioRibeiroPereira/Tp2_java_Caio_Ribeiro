import java.util.Scanner;

public class Descontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        double desconto = 0;

        if (valorCompra > 1000) {
            desconto = valorCompra * 0.10;
        } else if (valorCompra >= 500) {
            desconto = valorCompra * 0.05;
        }

        double valorFinal = valorCompra - desconto;

        System.out.printf("\nValor do produto: R$ %.2f", valorCompra);
        System.out.printf("\nDesconto de: R$ %.2f", desconto);
        System.out.printf("\nValor à pagar: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
