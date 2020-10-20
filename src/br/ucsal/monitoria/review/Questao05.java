package br.ucsal.monitoria.review;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nomeProduto; 
		int qtdMin, qtdMax;
		int media;
		
		System.out.println("Digite o nome do produto");
		nomeProduto = scan.next();
		
		System.out.println("Digite a quantidade minima do produto");
		qtdMin = scan.nextInt();
		
		System.out.println("Digite a quantidade máxima do produto");
		qtdMax = scan.nextInt();
		
		media = (qtdMin + qtdMax) / 2;
		
		System.out.println("O estoque médio de " + nomeProduto + " é: " + media);
	}

}
