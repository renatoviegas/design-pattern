package br.com.alura.visitor;

public interface Expressao {

	int avalia();
	
	void aceita(Visitor visitor);
	
}
