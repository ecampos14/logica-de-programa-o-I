package Cliente;

import java.util.Date;

	public class Cliente {
		
		private String nome, cpf, email, telefone;
		private Date nasc;
		private boolean alugado;
		
		public Cliente(String nome, String cpf, String email, String telefone,Date nasc, boolean alugado) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.email = email;
			this.telefone = telefone;
			this.nasc = nasc;
			this.alugado = alugado;
		}
		
		public void list (Cliente c) {
		System.out.println
		("nome: " + nome + "\n" +
		"cpf: "+ cpf + "\n"+
		"email: "+ email + "\n"+
		"telefone: "+ telefone + "\n"+
		"dia e horario do aluguel: "+ nasc + "\n" +
		"veiculo alugado: " + alugado+ "\n"
		);
		}
		
		public static void main(String[] args) {
			Date hoje = new Date();
			Cliente c1= new Cliente ( "bianca silva","23256578941","biancao5248@gg.com","80028922",hoje,true);
		
			Cliente c2= new Cliente ("pedro gouveia","45213265498","phnogouveia@gg.com","22982008",hoje,false);
			 
			c1.list(c2);

		}

}
