package encapsulamento;

import java.util.Scanner;

public class ContaMain {
	

    	public static void main(String[] args) {
    		
    		Scanner sc = new Scanner(System.in);
    		
    		Conta ct = new Conta(350);
    		
    		System.out.println("Bem-Vindo, digite o valor do depósito inicial");
    		ct.depositar(sc.nextDouble());
    		System.out.println("Seu saldo atual é : " + ct.getSaldo());
    		
    		System.out.println("Digite o valor do Saque: ");
    		ct.sacar(sc.nextDouble());
    	}
}

    	
