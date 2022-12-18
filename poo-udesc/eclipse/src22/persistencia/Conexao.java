package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection conexao = null;
	private static String senha;
	
	private Conexao() {
		
	}
	
	public static Connection getConexao() throws SQLException, ClassNotFoundException {
		if(conexao == null) {
			String url = "jdbc:postgresql://localhost:5432/redesocial";
			String username = "postgres";
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection(url, username, "postgres");
			
		}
		return conexao;
	}
	
	public static void setSenha(String senha) {
		Conexao.senha = senha;
	}

	

}
