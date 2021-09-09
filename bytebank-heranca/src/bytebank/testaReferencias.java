package bytebank;

public class testaReferencias {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		// Não Compila
		// Funcionario g1 = new Gerente("Nico", "", 1000, 0);
		// g1.setSenha(123);
		
		Gerente g1 = new Gerente("Nico", "", 1000, 0);
		Funcionario ev = new EditorDeVideo("", "", 11100);
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		controleBonificacao.registra(g1);
		controleBonificacao.registra(ev);
		
		System.out.println(controleBonificacao.getSoma());
	}

}
