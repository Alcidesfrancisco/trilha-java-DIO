package desafio_DIO_Banco;

public class Cliente {

	private String nome;
	private String CPF;
	
	public Cliente(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setNome(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
}

