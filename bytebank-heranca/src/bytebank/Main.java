package bytebank;

public class Main {

	public static void main(String[] args) {
		Funcionario rodrigo = new Funcionario("Rodrigo", "000.000.000-12", 1220);
		System.out.println(rodrigo.getBonificacao());
		
		Gerente nico = new Gerente("Nico", "000.000.000-11", 1000.0, 1234);
		System.out.println(nico.autentica(1234));
	}

}
