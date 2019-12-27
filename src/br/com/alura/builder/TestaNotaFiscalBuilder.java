package br.com.alura.builder;

public class TestaNotaFiscalBuilder {

	public static void main(String[] args) {

		ItemDaNotaBuilder infBuilder = new ItemDaNotaBuilder();
		
		infBuilder.comDescricao("Mochila").comValor(399.89);
		ItemDaNota item = infBuilder.constroi();
						
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.paraEmpresa("Ackdata").comCnpj("12.279.899/0001-99")
				.com(new ItemDaNota("Caneta", 100.0))
				.com(new ItemDaNota("Caderno Top", 150.0))
				.com(item)
				.comObservacoes("Tudo certo");

		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}

}
