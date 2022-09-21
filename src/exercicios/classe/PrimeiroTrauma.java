package classe;

public  class PrimeiroTrauma {
	int a = 3; //Não pode mexer imprima a variavel " a "	
	static int b = 4;
	int c = 5;
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
	
		// para conseguir acessar a varialve é preciso torna-la static, ou intância-la dando new no metodo.
		//pode mexer aqui
		System.out.println( p.a); //Pode mexer aqui
		
		//pode mexer aqui.
		
		System.out.println(b);
		System.out.println(p.c);
		
	 
	}
	
}
