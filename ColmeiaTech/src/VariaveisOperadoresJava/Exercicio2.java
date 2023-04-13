package VariaveisOperadoresJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota do aluno:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota do aluno:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota do aluno:");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média final do aluno é: %.2f",media);
		
		leia.close();
	
	}

}
