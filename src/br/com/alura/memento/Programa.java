package br.com.alura.memento;

import java.time.LocalDate;

public class Programa {

	public static void main(String[] args) {

		Historico historico = new Historico();

		Contrato contrato = new Contrato(LocalDate.now(), "Renato", TipoContrato.NOVO);
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());

		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.avanca();
		historico.adiciona(contrato.salvaEstado());
		
		contrato.restaura(historico.pega(2));
	}

}
