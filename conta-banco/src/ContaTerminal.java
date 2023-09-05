import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");

        String agenciaCliente = scanner.next();

        System.out.println("Por favor, digite o número da conta:");

        int nContaCliente = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome:");

        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta:");

        Float saldoCliente = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente +
        ", obrigado por criar uma conta em nosso banco. Sua agência é "+agenciaCliente+
        ", conta "+ nContaCliente+
        " e seu saldo "+saldoCliente+
        " já está disponível para saque.");

        scanner.close();
    }
}
