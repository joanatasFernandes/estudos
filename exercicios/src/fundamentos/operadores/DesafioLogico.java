package fundamentos.operadores;

public class DesafioLogico {
	
	//Trabalho na terça (V ou F)
	// Trabalho na quinta (V ou F)
	public static void main(String[] args) {
		boolean trabalho1= false;
		boolean trabalho2 =false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 || trabalho2;
		boolean comprouSorvete = trabalho1 ^ trabalho2;
		//operador unário.
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("comprou TV50\"? " + comprouTV50 );
		System.out.println("comprou TV32\"? " + comprouTV32 );
		System.out.println("comprou sorvete\"? " + comprouSorvete +"\n" );
		
		
		System.out.println("Mais saudável\"? " + maisSaudavel );
		
		
	}

	
	
	
}
