package desafioBanco;

public class main {
	
	public static void main(String[] args) {
		Cliente silvio = new Cliente();
		silvio.setNome("Silvio");
		
		
		
		Conta cc = new ContaCorrente(silvio);
		Conta poupanca = new ContaPoupanca(silvio);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
