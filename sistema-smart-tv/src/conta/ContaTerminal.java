package conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor, digite o numero da agencia!: ");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o numero da conta!: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o nome do cliente!: ");
        String nome = sc.nextLine();
        double  saldo =  100D;
        Conta conta = new Conta(numero, agencia, nome, saldo);
        System.out.println("Dados do conta: " + conta);
        System.out.println("Saldo disponivel para saque: " + conta.getSaldo());

        sc.close();

    }
}
