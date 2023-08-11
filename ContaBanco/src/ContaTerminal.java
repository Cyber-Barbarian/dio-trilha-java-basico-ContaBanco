import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Decarando as variáveis
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        double saldo;
        String agencia, nomeCliente;

        //Input de dados
        System.out.println("Por favor, digite o seu Nome:");
        nomeCliente=sc.nextLine();
        System.out.println("Por favor, digite o número da Agência:");
        agencia=sc.next();
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta=sc.nextInt();
        System.out.println("Por favor, digite o Saldo:");
        saldo=sc.nextDouble();
        //Saída de dados
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+
                ", conta " + numeroConta + " e seu saldo de R$ " +saldo+" já está disponível para saque.");






    }
}
