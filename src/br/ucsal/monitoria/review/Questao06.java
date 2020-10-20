package br.ucsal.monitoria.review;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		int sexo;
		double altura, imc;
		 
		System.out.println("Selecione o seu sexo");
		System.out.println("1 - Masculino");
		System.out.println("2 - Feminino");
		sexo = scan.nextInt();
		
		System.out.println("Digite o seu nome");
		nome = scan.next();
		
		System.out.println("Digite a sua altura");
		altura = scan.nextDouble();
		
		if(sexo == 1) {
			imc = (72.7 * altura) - 58;
		} else {
			imc = (62.1 * altura) - 44.7;
		}
		
		System.out.println("Olá " + nome + " seu peso ideial é " + imc + " Kg");
	}

}
