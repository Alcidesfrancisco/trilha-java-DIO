package desafio_DIO_Banco;

public class Agencia {

	private String nome;
	private long numero;

	
	public Agencia(String nome, long numero, Banco banco) {
		super();
		this.nome = nome;
		this.numero = numero;
		banco.adicionarAgencia(this);
	}
	public String getNome() {
		return nome;
	}
	public long getNumero() {
		return numero;
	}
	
}
