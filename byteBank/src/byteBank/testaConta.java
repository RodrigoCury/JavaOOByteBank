package byteBank;

public class testaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(21, 21, new Cliente("", "", ""));
		cc.depositar(123.0);
		
		ContaPoupanca cp = new ContaPoupanca(21, 21, new Cliente("", "", ""));
		cp.depositar(123.0);
		
		cc.transfere(10.0, cp);
		
		cc.meMostra();
		cp.meMostra();
	}

}
