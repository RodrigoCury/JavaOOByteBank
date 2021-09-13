package contas;

import Excecoes.ValorInsuficienteException;
import clientes.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);

	}

	@Override
	public void depositar(double valorADepositar) throws ValorInsuficienteException{
		if (valorADepositar <= 0) 
			throw new ValorInsuficienteException();
		this.saldo = valorADepositar + this.getSaldo(); 
	}
}
