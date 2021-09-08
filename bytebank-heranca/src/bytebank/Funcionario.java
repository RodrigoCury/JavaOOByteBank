package bytebank;

public class Funcionario {
	public static int totalFuncionarios;
	protected String nome;
	protected String cpf;
	protected double salario;

	public Funcionario(String nome, String cpf, double salario) {
		// Para impedir a classe de ser instanciada
//		if(this instanceof Funcionario) {
//			throw new Exception("Funcionario não pode ser instanciado");
//		}
		this.setCpf(cpf);
		this.setNome(nome);
		this.setSalario(salario);
		totalFuncionarios++;
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}