import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual (R$): ");
        double salarioBruto = scanner.nextDouble();

        double imposto = 0;

    //de acordo com a tabela do IR de 2025
        if (salarioBruto <= 26963.20) {
            imposto = 0;
        } else if (salarioBruto <= 33919.80) {
            imposto = (salarioBruto * 0.075) - 2022.24;
        } else if (salarioBruto <= 45012.60) {
            imposto = (salarioBruto * 0.15) - 4566.23;
        } else if (salarioBruto <= 55976.16) {
            imposto = (salarioBruto * 0.225) - 7942.17;
        } else {
            imposto = (salarioBruto * 0.275) - 10740.98;
        }

        double salarioLiquido = salarioBruto - imposto;


        System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
        System.out.printf("\nImposto a pagar: R$ %.2f", imposto);
        System.out.printf("\nSalário Líquido: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}
