package desafio_DIO_Banco;

public class Main {
	
	//Criando o Banco DIO
	
	public static void main(String[] args) {
	
		
		Conta conta = new ContaCorrente(new Cliente("Aldo Francisco", "055987333-89"));
		
		conta.depositar(500.0);
		
		
		Conta conta2 = new ContaPoupanca(new Cliente("Anny Moura", "234899099-88"));
		
			conta.transferir(conta2, 250.0);
		
		conta.extrato();
		conta2.extrato();
	}

}
