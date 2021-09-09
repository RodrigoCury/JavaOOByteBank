package Funcionarios;

import Interfaces.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel{
	
	private int senha;

	public Administrador(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.5;
	}

	@Override
	public void setSenha(int senhaNova) {
		this.senha = senhaNova;
	}

	@Override
	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		return false;
	}

}
