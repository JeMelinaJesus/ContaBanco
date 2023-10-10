package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int numero;
	String agencia;
	String nomeCliente;
	double saldo;
	
	System.out.println("CONTA BANCARIA");
	System.out.println();
	System.out.println("Por favor digite onúmero da Conta:(1234)");
	numero= sc.nextInt();
	System.out.println("Agora digite o numero da Agencia;(123-8)");
	agencia= sc.next();
	System.out.println("Me informe seu nome:");
	nomeCliente= sc.next();
	sc.nextLine();
	System.out.println("Agora me informa seu saldo atual:");
	saldo=sc.nextDouble();
	
	System.out.println();
	System.out.printf("Ola %s, obrigado por criar uma conta em"     +"nosso banco,sua agencia é %s,"  + "conta  %d e seu saldo %.2f ja estã disponivel" + "para saque", nomeCliente, agencia, numero, saldo );
	
	
	sc.close();
	
	
	

	}

}
