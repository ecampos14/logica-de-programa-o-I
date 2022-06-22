package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.ConnectionEvent;

import DTO.ClienteDTO;




public class ClienteDAO {
	Connection conn;
	PreparedStatement stm;
	ResultSet rs;
	
	public ClienteDTO cadastrarCliente( String nome, String cpf, String telefone, String email) throws SQLException {
		
	String sql = "INSERT INTO cliente (nome, cpf, telefone, email) VALUES (?, ?, ?, ?)";
	try (Connection conn = new Conexao().conectaBD();
			PreparedStatement stm = conn.prepareStatement(sql);) {
			stm.setString(1, nome);
			stm.setString(2, cpf);
			stm.setString(3, telefone);
			stm.setString(4, email);
			stm.execute();
			stm.close();
}
	return null;
	}	
}