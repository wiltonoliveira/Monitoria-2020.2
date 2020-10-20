package br.ucsal.monitoria.LDE;

public class No {
	
	int num;
	No anterior;
	No prox;
	
	public No(int num) {
		this.num = num;
		this.anterior = null;
		this.prox = null;
	}
}
