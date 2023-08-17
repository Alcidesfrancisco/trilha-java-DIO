package desafio_DIO_Banco;

public class TransacaoBancariaException extends Exception {

	public TransacaoBancariaException(String mensagem) {
		System.err.println(mensagem);
	}
}
