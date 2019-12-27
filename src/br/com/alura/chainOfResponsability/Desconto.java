package br.com.alura.chainOfResponsability;

public abstract class Desconto implements Descontavel {

	protected Descontavel proximo;
		
	public void setProximo(Descontavel proximo) {
		this.proximo = proximo;		
	}

}
