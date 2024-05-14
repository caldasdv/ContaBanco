import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        int numeroCliente = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite numero de sua agencia: ");
        String agenciaCiente = sc.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Digite o seu saldo: ");
        double saldoCliente = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é " +agenciaCiente+ ", conta " +numeroCliente+ " e seu saldo " +saldoCliente+ " já está disponível para o saque.");
        
        sc.close();
    }
}
