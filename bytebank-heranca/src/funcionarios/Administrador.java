package funcionarios;

public class Administrador extends FuncionarioAutenticavel{
	
	public Administrador(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);
	}

	@Override
	public double getBonificacao() {
		return this.salario * 0.5;
	}

}
