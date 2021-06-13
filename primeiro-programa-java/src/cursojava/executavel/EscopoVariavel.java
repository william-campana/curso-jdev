package cursojava.executavel;

public class EscopoVariavel {
	
	static int maiorIdadeGlobal = 30;   // atributo global
	
	public static void main(String[] args) {
		int maiorIdadeLocal = 20;  // variável local
		
		System.out.println("Variavel Local: " + maiorIdadeLocal);
		
		metodo2();
	}
	
	public static void metodo2() {
		System.out.println("Variavel Global: " + maiorIdadeGlobal);
	} 

}
