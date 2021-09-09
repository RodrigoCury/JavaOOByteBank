package funcionarios;

import interfaces.Autenticavel;
import utils.AutenticacaoUtil;

abstract class FuncionarioAutenticavel extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticacaoUtil;
	
	public FuncionarioAutenticavel(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.autenticacaoUtil = new AutenticacaoUtil(senha);
	}

	@Override
	public void setSenha(int senhaNova) {
		this.autenticacaoUtil.setSenha(senhaNova);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacaoUtil.autentica(senha);
	}

}

