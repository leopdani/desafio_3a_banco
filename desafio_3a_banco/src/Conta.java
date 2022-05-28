
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
    protected double empresta;
    
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo +=  valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	@Override
	public void empresta(double valor) {
		// TODO Auto-generated method stub
		
		
		
		empresta = 1000;
		saldo += empresta;
		
	}
	
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getEmpresta() {
		return empresta;
	}


	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));	
		System.out.println(String.format("Saldo: %f", this.saldo));
		System.out.println(String.format("empresta: %f", this.empresta));
		
	}


	
	
}
