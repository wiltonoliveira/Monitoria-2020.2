package br.ucsal.monitoria.review;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = scan.nextInt();
		
		if(n1 == n2) {
			System.out.println("Os numeros sao iguais");
		} else if(n1 > n2) {
			System.out.println("O maior numero eh " + n1);
			System.out.println("O menor numero eh " + n2);
		} else {
			System.out.println("O maior numero eh " + n2);
			System.out.println("O menor numero eh " + n1);
		}
	}
	
}
