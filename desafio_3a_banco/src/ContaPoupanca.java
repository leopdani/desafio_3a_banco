
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		// TODO Auto-generated constructor stub
		super(cliente);
	}
	
	
	

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("====Extrato Conta Poupan�a ====");
		super.imprimirInformacoesComuns();
	}



/*
	@Override
	public void emprestar(double empresta, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	} */

	
	
}
