package Carro;

public class Carro {
	private String placa;
	private double potencia;
	private String modelo; 
	private String cor; 
	private String marca;
	private boolean cambio_automatico;
	private int ano; 
	private float preco;
	
	
	public Carro (String placa, double potencia, String modelo, String cor, String marca, boolean cambio_automatico,int ano,
	float preco) {
		this.placa=placa;
		this.potencia=potencia;
		this.modelo=modelo;
		this.cor=cor;
		this.marca=marca;
	    this.cambio_automatico=cambio_automatico;
	    this.ano=ano;
	    this.preco=preco;
}


	public void list (Carro c) {
		System.out.println("placa: " + placa + "\n" +
	"potencia: "+ potencia + "\n"+
	"modelo: "+ modelo + "\n"+
	"cor: "+ cor + "\n"+
	"marca: "+ marca + "\n" +
	"Cambio automatico: " + cambio_automatico+ "\n"+
	"ano: " + ano  + "\n" +
	"preço: " + preco + "\n");
	
}
	public static void main(String[] args) {
		
		
		 Carro c1= new Carro ( "fdg5200",2.0, "ferrari","preto","ferrari",true,2020,2400);
	
		 Carro c2= new Carro ("fds0520",1.0, "gol","azul","Volkswagen ",false,2010,4000);
		 
		c1.list(c2);

	}
}