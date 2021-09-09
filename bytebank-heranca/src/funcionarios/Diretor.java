package funcionarios;

public class Diretor extends FuncionarioAutenticavel {
	
	public Diretor(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);
	}

	@Override
	public double getBonificacao() {
		return this.salario * 2.0;
	}

}
