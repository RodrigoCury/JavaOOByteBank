package contas;

import Excecoes.SaldoInsuficienteException;
import Excecoes.ValorInsuficienteException;
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
	public void depositar(double valorADepositar) throws ValorInsuficienteException{
	if (valorADepositar <= 0.0)
		throw new ValorInsuficienteException();
	this.saldo = valorADepositar - 0.05 + this.getSaldo(); 	
	}
	
	@Override // Compilador sabe da intenção de Sobreescrever Métodos e avisa erros
	public void sacar(double valorASerSacado) throws SaldoInsuficienteException {
		valorASerSacado += 0.02;
		super.sacar(valorASerSacado);
	}

	
}
