package br.ucsal.monitoria.pilha;

public class MyMain {

	public static void main(String[] args) {
		PilhaSimples pilha = new PilhaSimples(10);
		
		pilha.push("1");
		System.out.println(pilha.peek());
	}

}
