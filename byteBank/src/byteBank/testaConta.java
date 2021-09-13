package byteBank;

import Seguros.SeguroDeVida;
import clientes.Cliente;
import contas.ContaCorrente;

public class testaConta {

	public static void main(String[] args) {
		
		SeguroDeVida sVida = new SeguroDeVida();
		
		ContaCorrente cc = new ContaCorrente(21, 21, new Cliente("", "", ""));
		cc.depositar(123.0);
		
		CalculadorDeImposto.registra(cc);
		CalculadorDeImposto.registra(cc);
		CalculadorDeImposto.registra(cc);
		CalculadorDeImposto.registra(sVida);
		
		double total = CalculadorDeImposto.getTotalImposto();
		System.out.println(total);
	}

}
