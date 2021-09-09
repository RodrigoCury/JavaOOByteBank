package byteBank;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);

	}
	
	@Override
	public void depositar(double valorADepositar) {
		if (valorADepositar > 0) 
			this.saldo = valorADepositar - 0.05 + this.getSaldo(); 
		else
			System.out.println("impossível sacar");
		
	}
	
	@Override // Compilador sabe da intenção de Sobreescrever Métodos e avisa erros
	public boolean sacar(double valorASerSacado) {
		valorASerSacado += 0.02;
		return super.sacar(valorASerSacado);
	}

	
}
