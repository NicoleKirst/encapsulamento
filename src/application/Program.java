package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Digite o número da conta: ");
		int number = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Existe um depósito inicial (s/n)?");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print("Insira o valor do depósito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Insira um valor de depósito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Insira um valor de retirada: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		sc.close();
	}

}