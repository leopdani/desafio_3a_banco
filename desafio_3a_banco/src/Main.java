
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente leonardo = new Cliente();
		leonardo.setNome("Leonardo");
		
		Conta cc = new ContaCorrente(leonardo);
		
		cc.depositar(100);// Adicionei R$100,00 Conta Corrente
		cc.sacar(50);// Retirei (Gastei) R$ 50,00
		
		Conta poupanca = new ContaPoupanca(leonardo);
		
		cc.transferir(25, poupanca );	// Transferi R$ 25,00 para conta poupança	
		cc.imprimirExtrato(); // Saldo final CC= R$ 25,00 e Poupança = R$ 25,00
		poupanca.imprimirExtrato();
		
		
		cc.empresta(1000);
		
		cc.imprimirExtrato();  //Saldo final CC= R$ 1025,00 e Poupança = R$ 25,00
		
		
		
	}

}