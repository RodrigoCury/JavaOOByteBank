package Seguros;

import interfaces.Tributavel;

public class SeguroDeVida implements Tributavel{

	public SeguroDeVida() {
	}

	public double getValorImposto() {
		return 0.05;
	}

}
