package PessoasTerceiras;

import Interfaces.Autenticavel;

public class Fiscal implements Autenticavel{
	
	private int senha;

	public Fiscal() {
		this.senha = senha;
	}

	@Override
	public void setSenha(int senhaNova) {
		this.senha = senhaNova;
	}

	@Override
	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		}
		return false;
	}

}

