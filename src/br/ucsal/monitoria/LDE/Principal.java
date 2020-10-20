package br.ucsal.monitoria.LDE;

public class Principal {

	public static void main(String[] args) {
		LDE lista = new LDE();
		
		lista.insereInicio(2);
		lista.insereInicio(1);
		
		lista.insereFinal(3);
		lista.insereFinal(4);
		lista.insereFinal(5);
		lista.insereFinal(6);
		
		
		lista.exibeLista();
		System.out.println("\n");
		lista.exibeFinalComeco();
	}

}
