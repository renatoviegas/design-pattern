package br.com.alura.flyweight;

import java.util.Arrays;
import java.util.List;

public class TestaNotasMusicais {

	public static void main(String[] args) {

		NotasMusicais notas = new NotasMusicais();

		List<Nota> doReMiFa = Arrays.asList(notas.pega("do"), notas.pega("re"), notas.pega("mi"), notas.pega("fa"),
				notas.pega("fa"), notas.pega("fa"),

				notas.pega("do"), notas.pega("re"), notas.pega("do"), notas.pega("re"), notas.pega("re"),
				notas.pega("re"),

				notas.pega("do"), notas.pega("sol"), notas.pega("fa"), notas.pega("mi"), notas.pega("mi"),
				notas.pega("mi"),

				notas.pega("do"), notas.pega("re"), notas.pega("mi"), notas.pega("fa"), notas.pega("fa"),
				notas.pega("fa"));
		
		List<Nota> atireiOPauNoGato = Arrays.asList(notas.pega("sol"), notas.pega("sol"), notas.pega("sol"), notas.pega("sol"),
				notas.pega("fa"), notas.pega("mi"),

				notas.pega("sol"), notas.pega("sol"), notas.pega("do"), notas.pega("do"), notas.pega("si"),
				notas.pega("la"),

				notas.pega("la"), notas.pega("la"), notas.pega("re"), notas.pega("res"), notas.pega("res"),
				notas.pega("dos"),

				notas.pega("si"), notas.pega("si"), notas.pega("si"), notas.pega("la"), notas.pega("sol"),
				notas.pega("la"), notas.pega("si"), notas.pega("do"));


		 Piano piano = new Piano();
		 //piano.toca(doReMiFa);		
		 piano.toca(atireiOPauNoGato);
	}

}
