package desafio_DIO_Banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	private String nome;
	private Set<Cliente> clientes;
	private Set<Agencia> agencias;
	
	public Banco(String nome) {
		this.nome = nome;
		clientes = new HashSet<Cliente>();
		agencias = new HashSet<Agencia>();
	}

	public Set<Agencia> getAgencias() {
		return agencias;
	}
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public String getNome() {
		return nome;
	}
	public void adicionarAgencia(Agencia agencia) {
		agencias.add(agencia);
	}
}
