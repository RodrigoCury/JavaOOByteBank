package interfaces;

// contrato Autenticavel
	// Quem Assina precisa implementar os métodos abstratos	

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senhaNova);
	
	public abstract boolean autentica(int senha); 
}
