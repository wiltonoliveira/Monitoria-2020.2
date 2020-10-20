package br.ucsal.monitoria.lista3;

public class Principal {

	public static void main(String[] args) {
		
		ListaProfessores a = new ListaProfessores();
		
		a.inserir("Mário Jorge");
		a.inserir("Claudio Neiva");
		a.inserir("Osvaldo");
		
		a.removerFinal();
		a.removerFinal();
		a.removerFinal();
		
		System.out.println(a.exibir());
		System.out.println(a.verificarTamanho());
	}

}
