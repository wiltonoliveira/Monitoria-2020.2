package br.ucsal.monitoria.review;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		double n1, n2, n3;
		double media;
		
		System.out.print("Digite o nome do aluno: ");
		name = scan.next();
		
		System.out.println("Digite as notas do aluno: ");
		System.out.print("Nota 1: ");
		n1 = scan.nextDouble();
		
		System.out.print("Nota 2: ");
		n2 = scan.nextDouble();
		
		System.out.print("Nota 3: ");
		n3 = scan.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println("A média final de " + name + " é " + media);
	}

}
