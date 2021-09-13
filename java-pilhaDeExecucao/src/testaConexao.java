
public class testaConexao{

	public static void main(String[] args) throws Exception {
		
		
		try (Conexao c = new Conexao()){
			c.leDados();
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		}
		
		// ..........................
		
//		Conexao c = null;
//		try {
//			c = new Conexao();
//			c.leDados();
//		} catch (IllegalStateException e) {
//			System.err.println(e.getMessage());
//		} finally {
//			c.fechaConexao();			
//		}
	}

}
