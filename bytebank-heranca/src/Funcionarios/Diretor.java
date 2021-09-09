package Funcionarios;

import Interfaces.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {

	private int senha;

	public Diretor(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	@Override
	public double getBonificacao() {
		return this.salario;
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
