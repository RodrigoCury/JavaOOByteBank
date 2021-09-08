package bytebank;

public class Gerente extends Funcionario {
	
	private int senha;

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (senha == this.senha)
			return true;
		return false;
	}
	
	public double getBonificacao() {
		return this.getSalario();
	}
	

}