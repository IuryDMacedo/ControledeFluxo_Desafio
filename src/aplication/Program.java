package aplication;

import java.util.Scanner;

import entities.ContadorJava;
import entities.ParametrosInvalidosException;

public class Program {
	
	
				
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		try {
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		
			//chamando o método contendo a lógica de contagem
			ContadorJava conta = new ContadorJava(parametroUm, parametroDois);
			conta.contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());
		}
		
		terminal.close();
		
	}
	
				
		
		

	
	
}
