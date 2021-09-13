
public class Conexao implements AutoCloseable {

	public Conexao() {
		System.out.println("Conex�o Aberta");
	}
	
	public void leDados() {
		System.out.println("Lendo Dados");
		throw new IllegalStateException("Dados Ilegais");
	}
	
	public void fechaConexao() {
		System.out.println("Conex�o fechada!");
	}

	@Override
	public void close() throws Exception {
		this.fechaConexao();
	}

}
