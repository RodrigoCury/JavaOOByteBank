package byteBank;

import interfaces.Tributavel;

public class CalculadorDeImposto {
	
	private static double totalImposto = 0;

	public static void registra(Tributavel t) {
		double valor = t.getValorImposto();
		totalImposto += valor;
	}
	
	public static double getTotalImposto() {
		return totalImposto;
	}
}
