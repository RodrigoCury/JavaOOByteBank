package bytebank;

import Controle.SistemaInterno;
import Funcionarios.Administrador;
import Funcionarios.Diretor;
import Funcionarios.Gerente;

public class testaSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("", "", 0.0, 1234);
		Administrador administrador = new Administrador("", "", .0, 1232);
		Diretor diretor = new Diretor("", "", 1, 1234);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(diretor);

	}

}
