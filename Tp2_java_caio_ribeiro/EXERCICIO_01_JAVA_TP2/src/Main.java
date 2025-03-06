import java.util.Scanner;

 class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();


        System.out.println("\n=== Cadastro Realizado ===");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Nome do Pai: " + nomePai);

        if (nomeUsuario.length() > nomeMae.length() && nomeUsuario.length() > nomePai.length()) {
            System.out.println("Seu nome é o mais longo.");
        } else if (nomeMae.length() > nomeUsuario.length() && nomeMae.length() > nomePai.length()) {
            System.out.println("O nome da sua mãe é o mais longo.");
        } else if (nomePai.length() > nomeUsuario.length() && nomePai.length() > nomeMae.length()) {
            System.out.println("O nome do seu pai é o mais longo.");
        } else {
            System.out.println("Há nomes com tamanhos iguais.");
        }

        scanner.close();
    }
}
