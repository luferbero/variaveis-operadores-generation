package VariaveisOperadoresJava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o seu Salário Bruto:");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o seu Adicional Noturno:");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as suas Horas Extras:");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os seus Descontos:");
		descontos = leia.nextFloat();
		
		horasExtras = horasExtras * 5;
		
		salarioLiquido = (salarioBruto + adicionalNoturno + horasExtras) - descontos;
		
		System.out.printf("\nSeu Salário Líquido é: %.2f", salarioLiquido);
		
		leia.close();
	}

}
