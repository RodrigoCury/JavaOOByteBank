package byteBank;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);

	}

	@Override
	public void depositar(double valorADepositar) {
		if (valorADepositar > 0) 
			this.saldo = valorADepositar + this.getSaldo(); 
		else
			System.out.println("impossível sacar");

	}
}
