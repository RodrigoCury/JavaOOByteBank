package contas;

import Excecoes.SaldoInsuficienteException;
import Excecoes.ValorInsuficienteException;
import clientes.Cliente;

public abstract class Conta {
	private static int totalDeContas = 0;
	protected double saldo = 0;
	private int agencia;
	private int numero;
	private Cliente titular;

	public Conta(int agencia, int numero, Cliente titular) {
		this.setAgencia(agencia);
		this.numero = numero;
		this.titular = titular;
		totalDeContas++;
	}

	public void sacar(double valorASerSacado) throws SaldoInsuficienteException{
		if (valorASerSacado > this.saldo && valorASerSacado <= 0.0) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= valorASerSacado;
	}

	public abstract void depositar(double valorADepositar) throws ValorInsuficienteException;

	public void transfere(double valorATransferir, Conta contaRecebedora) throws ValorInsuficienteException, SaldoInsuficienteException{
		this.sacar(valorATransferir);
		contaRecebedora.depositar(valorATransferir);
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0 && agencia < 100)
			this.agencia = agencia;
		else
			System.out.println("Impossível fazer saque");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}
	
	public void meMostra() {
		System.out.println("Agência: " + this.agencia);
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: R$" + this.saldo);
		System.out.println(this.getClass());
		System.out.println();
	}
}
