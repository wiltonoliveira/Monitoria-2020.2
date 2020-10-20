package br.ucsal.monitoria.review;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2, saida = 0, operacao;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = scan.nextInt();
		
		System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		System.out.println("Digite a operacao desejada");
		operacao = scan.nextInt();
		
		switch (operacao) {
		
		case 1:{
			saida = n1 + n2;
			break;
		}
		case 2:{
			saida = n1 - n2;
			break;
		}
		case 3:{
			saida = n1 * n2;
			break;
		}
		case 4:{
			saida = n1 / n2;
			break;
		}
		}
	
	System.out.println("O resultado da opeação é: " + saida);
	}

}
