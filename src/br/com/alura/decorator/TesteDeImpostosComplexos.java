package br.com.alura.decorator;

import br.com.alura.strategy.ICMS;
import br.com.alura.strategy.ISS;
import br.com.alura.strategy.Imposto;
import br.com.alura.strategy.Orcamento;
import br.com.alura.templateMethod.ICPP;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
				
		Imposto imposto = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = imposto.calcula(orcamento);
		
		System.out.println(valor);
		
	}
}
