package PessoasTerceiras;

import Interfaces.Autenticavel;

public class Cliente implements Autenticavel {
	
	private int senha;

	public Cliente(int senha) {
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
