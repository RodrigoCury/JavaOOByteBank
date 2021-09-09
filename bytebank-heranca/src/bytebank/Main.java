package bytebank;

public class Main {

	public static void main(String[] args) {
		Gerente rodrigo = new Gerente("Rodrigo", "000.000.000-12", 1220, 1234);
		System.out.println(rodrigo.getBonificacao());
		
		Gerente nico = new Gerente("Nico", "000.000.000-11", 1000.0, 1234);
		System.out.println(nico.autentica(1234));
		
		// Todos tem acesso a mesma informação
		System.out.println(Funcionario.totalFuncionarios);
		System.out.println(Gerente.totalFuncionarios);
		
		System.out.println(nico.getBonificacao());
	}

}
