package pessoasTerceiras;

import interfaces.Autenticavel;
import utils.AutenticacaoUtil;

public class PessoaAutenticavel implements Autenticavel{

	private AutenticacaoUtil autenticacaoUtil;

	public PessoaAutenticavel(int senha) {
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
