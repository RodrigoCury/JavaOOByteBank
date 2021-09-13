package Excecoes;

@SuppressWarnings("serial")
public class ValorInsuficienteException extends Exception {

	public ValorInsuficienteException() {
		super("Valor insuficiente!");
	}

	public ValorInsuficienteException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ValorInsuficienteException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ValorInsuficienteException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ValorInsuficienteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
