package bytebank;

public class Diretor extends FuncionarioAutenticavel {

	public Diretor(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario, senha);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getBonificacao() {
		// TODO Auto-generated method stub
		return this.salario * 2.0;
	}

}
