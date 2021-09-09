package utils;

public class AutenticacaoUtil {

	private int senha;
	
	public AutenticacaoUtil(int senha) {
		this.setSenha(senha);
	}
	
	public void setSenha(int senhaNova) {
		this.senha = senhaNova;
	}

	public boolean autentica(int senha) {
		if (senha == this.senha) {
			return true;
		}
		return false;
	}

}
