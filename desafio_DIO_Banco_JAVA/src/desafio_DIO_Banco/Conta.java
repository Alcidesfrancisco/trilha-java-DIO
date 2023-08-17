package desafio_DIO_Banco;

public abstract class Conta {
	protected static long SEQUENCIAL_CONTAS = 1010;
	public static final Banco BANCO_DIO = new Banco("Banco DIO");
	public static final Agencia AGENCIA_PADRAO= new Agencia("MATRIZ", 2233, BANCO_DIO);
	protected Agencia agencia;
	protected Long numero;
	protected Double saldo; 
	protected Cliente cliente;

	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL_CONTAS++;
		this.saldo = 0.0;
	}
	public void sacar(Double valor) throws TransacaoBancariaException {
		if(valor <= saldo)	this.saldo -= valor;
		else
		throw new TransacaoBancariaException("Saldo Insuficiente");
	}
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	public void transferir(Conta contaDestino, Double valor) {
		try {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} catch (TransacaoBancariaException e) {
			e.printStackTrace();
		}
		
	}
	public void extrato() {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println(BANCO_DIO.getNome());
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Extrato da conta "+ this.numero);
		System.out.println("Agencia: " +  this.agencia.getNumero());
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Saldo: " + this.saldo);
	}
}