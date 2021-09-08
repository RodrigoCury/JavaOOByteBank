package bytebank;

public class EditorDeVideo extends Funcionario {

	public EditorDeVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + this.salario * 0.01;
	}

}
