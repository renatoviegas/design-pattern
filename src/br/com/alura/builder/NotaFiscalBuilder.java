package br.com.alura.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.observer.AcoesAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private List<ItemDaNota> itens = new ArrayList<ItemDaNota>();
	private List<AcoesAposGerarNota> acoes;

	public NotaFiscalBuilder() {
		this.dataDeEmissao = Calendar.getInstance();
		this.acoes = new ArrayList<AcoesAposGerarNota>();
	}

	public NotaFiscalBuilder(List<AcoesAposGerarNota> acoes) {
		this.dataDeEmissao = Calendar.getInstance();
		this.acoes = acoes;
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder naData(Calendar data) {
		this.dataDeEmissao = data;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder com(ItemDaNota item) {
		itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public void adicionaAcao(AcoesAposGerarNota acao) {
		acoes.add(acao);
	}

	public NotaFiscal constroi() {

		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, valorBruto, impostos, dataDeEmissao, observacoes, itens);

		acoes.stream().forEach(acao -> {
			acao.executa(nf);
		});

		return nf;
	}

}
