package bytebank;

public class EditorDeVideo extends Funcionario {

	public EditorDeVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double getBonificacao() {
		return this.getSalario() * 0.2;
	}

}
