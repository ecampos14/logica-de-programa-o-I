package com.example.view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import DAO.CarroDAO;
import DAO.ClienteDAO;
import DAO.MotoDAO;
import DTO.CarroDTO;
import DTO.ClienteDTO;
import DTO.MotoDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController {

	@FXML
	private AnchorPane geral3;

	@FXML
	private AnchorPane geral2;

	@FXML
	private AnchorPane geral;

	@FXML
	private TextField txtnome;

	@FXML
	private TextField txtcpf;

	@FXML
	private TextField txtemail;

	@FXML
	private TextField txttel;

	@FXML
	private TextField txtplaca;

	@FXML
	private TextField txtcor;

	@FXML
	private TextField txtpreco;

	@FXML
	private TextField txtmarca;

	@FXML
	private TextField txtmarcam;

	@FXML
	private TextField txtcorm;

	@FXML
	private TextField txtprecom;

	@FXML
	private TextField txtano;

	@FXML
	private Tooltip toolConsultar12111;

	
//Cliente
	@FXML
	void btnCadastrar(ActionEvent event) throws SQLException {

		String nome = this.txtnome.getText();
		String cpf = this.txtcpf.getText();
		String telefone = this.txttel.getText();
		String email = this.txtemail.getText();

		ClienteDTO objClienteDTO = new ClienteDTO();
		ClienteDAO dao = new ClienteDAO();
		objClienteDTO = dao.cadastrarCliente(nome, cpf, telefone, email);
		limparcliente();

	}
	private void limparcliente() {
		txtnome.clear();
		txtcpf.clear();
		txttel.clear();;
		txtemail.clear();
	}

	
//Carro
	@FXML
	void btnCadastrarcarro(ActionEvent event) throws SQLException {
		String placa = this.txtplaca.getText();
		String cor = this.txtcor.getText();
		String marca = this.txtmarca.getText();
		String preco = this.txtpreco.getText();

		CarroDTO objCarroDTO = new CarroDTO();
		CarroDAO dao = new CarroDAO();
		objCarroDTO = dao.cadastrarCarro(marca, cor, placa, preco);
		limparcarro();
	}

	private void limparcarro() {
		txtplaca.clear();
		txtcor.clear();
		txtmarca.clear();
		txtpreco.clear();
	}
	
//Moto
	@FXML
	void btnCadastrarmoto(ActionEvent event) throws SQLException {
		String placa = this.txtmarcam.getText();
		String cor = this.txtcorm.getText();
		String ano = this.txtano.getText();
		String preco = this.txtprecom.getText();

		MotoDTO objmotoDTO = new MotoDTO();
		MotoDAO dao = new MotoDAO();
		objmotoDTO = dao.cadastrarMoto(ano, cor, placa, preco);
		limparmoto();
	}
	
	private void limparmoto() {
		txtano.clear();
		txtcorm.clear();
		txtmarcam.clear();
		txtprecom.clear();
	}

	
//Telas
	@FXML
	void btnCarro(ActionEvent event) throws IOException, SQLException {

		FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Carro.fxml"));
		Scene scene = new Scene((Parent) fxmlLoader.load(), 430, 400);
		Stage stage = new Stage();
		stage.setTitle("Cadastro de Carro");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();

	}

	@FXML
	void btnMoto(ActionEvent event) throws IOException, SQLException {

		FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Moto.fxml"));
		Scene scene = new Scene((Parent) fxmlLoader.load(), 430, 400);
		Stage stage = new Stage();
		stage.setTitle("Cadastro de Moto");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();

	}

}
