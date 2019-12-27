package br.com.alura.templateMethod;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.strategy.Item;
import br.com.alura.strategy.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return existemDoisItensComMesmoNome(orcamento);
	}

	private boolean existemDoisItensComMesmoNome(Orcamento orcamento) {

		Set<String> set = new HashSet<String>();

		for (Item item : orcamento.getItens()) {
			if (set.contains(item.getNome())) {
				return true;
			} else {
				set.add(item.getNome());
			}				
		}

		return false;
	}

	@Override
	protected double maximaTaxaca(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100.0;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

}
