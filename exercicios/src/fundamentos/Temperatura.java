package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC , lembrando que no Java sera nescessario adicionar 5 / 9.0 para que o resultado seja correto
		final double subtrator = 32;
		final double multiplicador = 5 / 9.0;
		
		
		double tempCelcious = 86;
		double temponvercao =  (tempCelcious - subtrator) * multiplicador;
		
		System.out.println("A temperatura em Celsius "  + temponvercao + "ºC" );
		
		
		System.out.println(" A temperatura em fahrenheit " + tempCelcious ); 
	}

}
