package br.com.alura.flyweight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static List<Class<? extends Nota>> clazzes;

	static {
		clazzes = Arrays.asList(Do.class, Re.class, Mi.class, Fa.class, Sol.class, La.class, Si.class, DoS.class, ReS.class);

		/*
		 * notas.put("do", new Do()); notas.put("re", new Re()); notas.put("mi", new
		 * Mi()); notas.put("fa", new Fa()); notas.put("sol", new Sol());
		 * notas.put("la", new La()); notas.put("si", new Si());
		 */

	}

	public Nota pega(String nome) {

		if (!notas.containsKey(nome)) {
			clazzes.stream().forEach(clazz -> {
				if (clazz.getSimpleName().toLowerCase().equals(nome)) {
					try {
						notas.put(nome, clazz.newInstance());
					} catch (InstantiationException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			});
		}

		return notas.get(nome);
	}
}
