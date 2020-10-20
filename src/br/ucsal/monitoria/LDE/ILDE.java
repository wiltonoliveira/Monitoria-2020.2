package br.ucsal.monitoria.LDE;

public interface ILDE {
	public void insereInicio(int num);
	public void insereFinal(int num);
		
	public String buscaValor(int num);
	
	public void removeInicio();
	public void removeFim();
	
	public void exibeLista();
	
}
