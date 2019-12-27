package br.com.alura.observer;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.builder.ItemDaNota;
import br.com.alura.builder.ItemDaNotaBuilder;
import br.com.alura.builder.NotaFiscal;
import br.com.alura.builder.NotaFiscalBuilder;

public class TestaObserver {

	public static void main(String[] args) {

	ItemDaNotaBuilder infBuilder = new ItemDaNotaBuilder();
		
		infBuilder.comDescricao("Mochila").comValor(399.89);
		ItemDaNota item = infBuilder.constroi();
						
		List<AcoesAposGerarNota> acoes = new ArrayList<AcoesAposGerarNota>();
		acoes.add(new SalvarNotaNoBanco());
		acoes.add(new EnviarNotaPorEmail());
		acoes.add(new EnviarNotaPorSms());
		acoes.add(new ImprimirNota());
		acoes.add(new Multiplicador(2));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);
		
		
		builder.paraEmpresa("Ackdata").comCnpj("12.279.899/0001-99")
				.com(new ItemDaNota("Caneta", 100.0))
				.com(new ItemDaNota("Caderno Top", 150.0))
				.com(item)
				.comObservacoes("Tudo certo");

		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
