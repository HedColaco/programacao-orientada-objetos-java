package banco;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		sc.nextLine();           /* quebra de linha. */
		String titular = sc.nextLine();
		System.out.print("Tem deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);           /*para ler caracteres */
		if (resposta == 's') {
			System.out.print("Insira o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira um valor de depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Insira um valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
				
		sc.close();
	}

}
