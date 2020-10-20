package br.ucsal.monitoria.lista3;


public class ListaProfessores {
	
	Professor inicio;
	
	public ListaProfessores() {
		inicio = null;
	}
	
	public void inserir(String nome) {
		Professor novoProfessor = new Professor(nome);
		
		if(inicio == null) {
			inicio = novoProfessor;
		} else {
			Professor atual = inicio;
			while(atual.prox != null) {
				atual = atual.prox;
			}
			atual.prox = novoProfessor;
			novoProfessor.prox = null;
		}
	}
	
	public String exibir() {
		if (inicio == null)
			return "Lista vazia\n"; // teste de lista vazia
		String str = "Lista Encadeada: ";
		for (Professor nodo = inicio; nodo != null; nodo = nodo.prox)
			str += " " + nodo.nome + "\n";
		return str + "\n";
	}
	
	public void removerFinal() {
		if(inicio.prox == null) {
			inicio = null;
		} else {
			Professor anterior = null;
			Professor atual = inicio;
			
			while(atual.prox != null) {
				anterior = atual;
				atual = atual.prox;
			}
			anterior.prox = null;
		}
	}
	
	public int verificarTamanho() {
		if(inicio == null) {
			return 0;
		} else {
			
			int count = 1;
			Professor atual = inicio;
			while(atual.prox != null) {
				count++;
				atual = atual.prox;
			}			
			return count;
		}
	}
}
















