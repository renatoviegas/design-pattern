package br.com.alura.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnectionFactory {

	public Connection getConnection() {

		try {
			String banco = System.getenv("tipoBanco").toLowerCase();
			
			if (banco == null) throw new RuntimeException("Banco não informado!");
			
			switch (banco) {
			case "h2":
				return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			case "mysql":
				return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			default:
				throw new RuntimeException("Banco informado não encontrado!");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
