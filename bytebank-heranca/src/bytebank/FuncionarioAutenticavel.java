package bytebank;

public abstract class FuncionarioAutenticavel extends Funcionario {
	
	private int senha;

	public FuncionarioAutenticavel(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		return false;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
