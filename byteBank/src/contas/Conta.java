package contas;

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

	public boolean sacar(double valorASerSacado) {
		if (valorASerSacado <= this.saldo && valorASerSacado > 0.0) {
			this.saldo -= valorASerSacado;
			return true;
		}
		return false;
	}

	public abstract void depositar(double valorADepositar);

	public boolean transfere(double valorATransferir, Conta contaRecebedora) {
		if (valorATransferir <= this.saldo && valorATransferir > 0.0) {
			this.sacar(valorATransferir);
			contaRecebedora.sacar(valorATransferir);
			return true;
		}
		return false;
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
