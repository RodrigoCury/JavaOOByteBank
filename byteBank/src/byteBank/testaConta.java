package byteBank;

import Seguros.SeguroDeVida;
import clientes.Cliente;
import contas.ContaCorrente;

public class testaConta {

	public static void main(String[] args) {
		
		SeguroDeVida sVida = new SeguroDeVida();
		
		try {
			ContaCorrente cc = new ContaCorrente(21, 21, new Cliente("", "", ""));
			cc.depositar(123.0);
			
			ContaCorrente cc2 = new ContaCorrente(21, 21, new Cliente("", "", ""));
			cc2.depositar(-12.0);
			
			CalculadorDeImposto.registra(cc);
			CalculadorDeImposto.registra(cc);
			CalculadorDeImposto.registra(cc);
			CalculadorDeImposto.registra(sVida);
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.getStackTrace();
		}
		
		double total = CalculadorDeImposto.getTotalImposto();
		System.out.println(total);
	}

}
