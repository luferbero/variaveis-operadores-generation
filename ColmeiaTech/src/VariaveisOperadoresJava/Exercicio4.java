package VariaveisOperadoresJava;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, diferenca;
		
		System.out.println("Digite um número:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite outro número:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite outro número:");
		n3 = leia.nextFloat();
		
		System.out.println("Digite outro número:");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença é de: %.1f", diferenca);
		
		leia.close();
		
	}

}
