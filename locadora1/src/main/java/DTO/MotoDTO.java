package DTO;

public class MotoDTO {
	private String placa;
	private String cor;
	private String ano;
	private String preco;
	private String idCliente;
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public MotoDTO() {
		this.placa=placa;
		this.cor=cor;
		this.ano=ano;
		this.preco=preco;
	} 
	
}
