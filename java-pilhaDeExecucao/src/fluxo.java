public class fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");		
	}
	
	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		for (int i = 0; i <= 5; i++){
			System.out.println(i);			
		}
		System.out.println("fim do metodo2");				
	}

}
