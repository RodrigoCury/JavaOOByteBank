package funcionarios;

public class Gerente extends FuncionarioAutenticavel{

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);
	}

	@Override
	public double getBonificacao() {
		return this.salario;
	}

}
