import java.util.Scanner;

public class SenhaValida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre sua senha: ");
        String senha = scanner.nextLine();

        String senhaDigitada;

        do {
            System.out.print("Digite novamente a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(senha)) {
                System.out.println("Senha incorreta!!! Tente novamente.");
            }
        } while (!senhaDigitada.equals(senha));

        System.out.println("Senha cadastrada!");

        scanner.close();
    }
}
