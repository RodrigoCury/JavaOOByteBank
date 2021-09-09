package bytebank;

public class Administrador extends FuncionarioAutenticavel {

	public Administrador(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);
	}

	@Override
	double getBonificacao() {
		// TODO Auto-generated method stub
		return this.salario * 0.5;
	}

}
