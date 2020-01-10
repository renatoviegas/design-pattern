package br.com.alura.adapter;

import java.time.LocalDate;

public class RelogioDoSistema implements Relogio {

	@Override
	public LocalDate hoje() {
		return LocalDate.now();
	}

}
