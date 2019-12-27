package br.com.alura.factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexaoBanco {

	public static void main(String[] args) throws SQLException {

		Connection conn = new DataConnectionFactory().getConnection();
		
		if (conn.isClosed()) System.out.println("Fechado");	
	}

}
