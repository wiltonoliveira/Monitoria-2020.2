package br.ucsal.monitoria.LDE;

public class LDE implements ILDE {
	private No inicio;
	private No fim;

	public LDE() {
		No inicio = null;
		No fim = null;
	}

	@Override
	public void insereInicio(int num) {
		No novoNo = new No(num);
		if (isVazio()) {
			inicio = novoNo;
			fim = novoNo;
		} else {
			novoNo.prox = inicio;
			inicio.anterior = novoNo;
			inicio = novoNo;
		}
	}

	@Override
	public void insereFinal(int num) {
		if (isVazio()) {
			insereInicio(num);
		} else {
			No novoNo = new No(num);
			novoNo.anterior = fim;
			fim.prox = novoNo;
			fim = novoNo;
			/*
			 * No novoNo = new No(num); No aux = inicio; while (aux.prox != null) {
			 * aux.anterior = aux; aux = aux.prox; } aux.prox = novoNo; novoNo.anterior =
			 * aux; // novoNo.prox = null; //REDUNDANTE POIS NO CONSTRUTOR JÀ APONTAMOS PRA
			 * NULL
			 */
		}
	}

	@Override
	public String buscaValor(int num) {
		if (isVazio()) {
			return "Lista Vazia";
		} else {
			No aux = inicio;
			do {
				if (aux.num == num) {
					return "Achou";
				} else {
					aux = aux.prox;
				}
			} while (aux.prox != null);
			return "Não encontrado";
		}
	}

	@Override
	public void removeInicio() {
		if (fim == inicio) {
			inicio = null;
			fim = null;
		} else
			inicio = inicio.prox;
	}

	@Override
	public void removeFim() {
		if (fim == inicio) {
			inicio = null;
			fim = null;
		} else {
			fim = fim.anterior;
		}
		/*
		 * No aux = inicio; while (aux.prox != null) { aux.anterior = aux; aux =
		 * aux.prox; } System.out.println(); aux = aux.anterior; aux.prox = null;
		 * exibeLista();
		 */
	}

	@Override
	public void exibeLista() {
		if (isVazio()) {
			System.out.println("Lista Vazia");
		} else {
			No aux = inicio;
			System.out.println("Inicio - Fim");
			while (aux != fim.prox) {
				System.out.print(aux.num + " ");
				aux = aux.prox;
			}
		}

	}
	
	public void exibeFinalComeco() {
		if (isVazio()) {
			System.out.println("Lista Vazia");
		} else {
			No aux = fim;
			System.out.println("Fim - Inicio");
			while (aux != inicio.anterior) {
				System.out.print(aux.num + " ");
				aux = aux.anterior;
			}
		}
	}

	private boolean isVazio() {
		if (inicio == null) {
			return true;
		}
		return false;
	}

}
