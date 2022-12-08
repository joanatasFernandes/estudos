package fundamentos.operadores;

public class Realcionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 >= 3);
		System.out.println(3 > 7);
		System.out.println(3 <=7);
		System.out.println(3 < 7);
		System.out.println(3 != 7);
		
		double nota = 9.1;
		boolean bomComportamento = true;
		boolean passoPorMedia = nota >=7;
		boolean direitoDesconto = bomComportamento && passoPorMedia;
		System.out.println("tem desconto?" + direitoDesconto);
		
	}

}
