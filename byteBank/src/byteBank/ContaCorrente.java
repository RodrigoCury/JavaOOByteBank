package byteBank;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);

	}
	
	@Override // Compilador sabe da intenção de Sobreescrever Métodos e avisa erros
	public boolean sacar(double valorASerSacado) {
		valorASerSacado += 0.02;
		return super.sacar(valorASerSacado);
	}

	
}
