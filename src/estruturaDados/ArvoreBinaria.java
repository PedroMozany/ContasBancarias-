package estruturaDados;

import application.Conta;

public class ArvoreBinaria {

	private Conta raiz;
	private ArvoreBinaria esquerda;
	private ArvoreBinaria direita;

	public ArvoreBinaria(Conta quem) {
		raiz = quem;
		esquerda = null;
		direita = null;
	}

	public ArvoreBinaria inserir(Conta qual, ArvoreBinaria onde) {
		if (onde == null) {
			ArvoreBinaria novoNodo = new ArvoreBinaria(qual);
			return novoNodo;
		} else {
			if (qual.ehMenorQue(onde.raiz)) {
				onde.esquerda = inserir(qual, onde.esquerda);
			}

			else {
				onde.direita = inserir(qual, onde.direita);
			}

		}
		return onde;
	}

	public Conta buscar(Conta qual, ArvoreBinaria onde) {
		if (onde != null) {

			if (qual.igual(onde.raiz)) {
				return onde.raiz;
			}
			if (qual.ehMenorQue(onde.raiz)) {
				return buscar(qual, onde.esquerda);
			}

			else {
				return buscar(qual, onde.direita);
			}

		} else {
			System.out.println("Nao encontrado!!");
			return null;
		}
		
	}
	
	 public String emOrdem(ArvoreBinaria onde){
	        if(onde!=null){
	            String aux = emOrdem(onde.esquerda);
	            aux+= onde.raiz.toString();
	            aux+= emOrdem(onde.direita);
	            return aux;
	        }
	        else return "";
	    }

}
