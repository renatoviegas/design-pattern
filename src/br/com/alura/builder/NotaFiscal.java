package br.com.alura.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private List<ItemDaNota> itens;

	public NotaFiscal(String razaoSocial, String cnpj, double valorBruto, double impostos, Calendar dataDeEmissao,
			String observacoes, List<ItemDaNota> itens) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.valorBruto = valorBruto;
		this.impostos = impostos;
		this.dataDeEmissao = dataDeEmissao;
		this.observacoes = observacoes;
		this.itens = itens;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public List<ItemDaNota> getItens() {
		return itens;
	}

}
