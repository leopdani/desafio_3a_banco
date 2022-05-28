
public interface IConta {
	
	void sacar(double valor); 
	
	void depositar(double valor); 
	
	void transferir(double valor, Conta contaDestino); 
	
	void empresta(double valor);// Adicionado 
	
	void imprimirExtrato();
}
