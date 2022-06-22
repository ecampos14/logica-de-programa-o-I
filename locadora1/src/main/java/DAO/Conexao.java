package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public Connection conectaBD() throws SQLException {
		Connection conn= null;
		
		try {
			  String Url = "jdbc:mysql://localhost:3306/locadora?user=root&password=ecampos";
              conn = DriverManager.getConnection(Url);
		} catch (Exception erro) {
			
		} return conn; 
		
	}
	}

