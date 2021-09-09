package contas;

import clientes.Cliente;
import interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);
	}
	
	@Override
	public double getValorImposto() {
		return this.saldo * 0.02;
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
