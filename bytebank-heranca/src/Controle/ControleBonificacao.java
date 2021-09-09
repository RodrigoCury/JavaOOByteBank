package Controle;

import Funcionarios.Funcionario;

public class ControleBonificacao {

	private double soma = 0;
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		
		this.soma += boni;
	}
	// Por Polimorfismo a função registra pode aceitar todas as classes herdeiras
//	public void registra(Gerente g) {
//		double boni = g.getBonificacao();
//		
//		this.soma += boni;
//	}
//	
//	public void registra(EditorDeVideo ev) {
//		double boni = ev.getBonificacao();
//		
//		this.soma += boni;
//	}
//	
	public double getSoma() {
		return this.soma;
	}

}
