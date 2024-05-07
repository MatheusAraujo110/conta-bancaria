import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela scanner o valor digitado no terminal

        // Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu none");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenone");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Digite sua conta de usuário");
        int usuario = scanner.nextInt();

        System.out.println();
        double saldo = 237.48;

        System.out.println(
                " Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + usuario + " e seu saldo " + saldo
                        + " já está disponível para saque");
    }
}
