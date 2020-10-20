package br.ucsal.monitoria.review;

public class Questao10 {

	public static void main(String[] args) {
		boolean primo = true;
		
		for (int i = 2; i <= 50; i++) {
			primo = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					primo = false;
				} 
			}
			if(primo) {
				System.out.println(i + ", ");
			}
		}
	}
}