package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.CarroDTO;


public class CarroDAO {
	Connection conn;
	PreparedStatement stm;
	ResultSet rs;
	
	public CarroDTO cadastrarCarro( String marca, String cor, String placa, String preco) throws SQLException {
		
	String sql = "INSERT INTO carro (marca, cor, placa, preco) VALUES (?, ?, ?, ?)";
	try (Connection conn = new Conexao().conectaBD();
			PreparedStatement stm = conn.prepareStatement(sql);) {
			stm.setString(1, marca);
			stm.setString(2, cor);
			stm.setString(3, placa);
			stm.setString(4, preco);
			stm.execute();
			stm.close();
}
	return null;
	}	
}


