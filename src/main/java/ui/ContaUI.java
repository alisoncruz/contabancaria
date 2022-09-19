package ui;

import model.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaUI {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor digite o número da model.Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor digite o número da Agência: ");
        scanner.nextLine();
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor digite o nome do Cliente: ");
        String nomeCliente= scanner.nextLine();

        System.out.println("Por favor digite o saldo: ");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(numeroConta,numeroAgencia,nomeCliente,saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d " +
                "e seu saldo %.2f já está disponível para saque", conta.getNomeCliente(),conta.getAgencia()
                ,conta.getNumero(),conta.getSaldo());
    }
}
