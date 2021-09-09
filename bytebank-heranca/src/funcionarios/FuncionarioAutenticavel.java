package funcionarios;

import interfaces.Autenticavel;

abstract class FuncionarioAutenticavel extends Funcionario implements Autenticavel{

	private int senha;
	
	public FuncionarioAutenticavel(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
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
