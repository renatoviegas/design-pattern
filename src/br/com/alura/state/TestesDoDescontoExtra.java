package br.com.alura.state;

public class TestesDoDescontoExtra {

	public static void main(String[] args) {

		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		reforma.aplicaDescontoExtra();
		
		reforma.finaliza();
//		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
	}

}
