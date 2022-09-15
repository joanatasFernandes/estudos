package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;// Atribuição por valor (Tipo primitivo).
		a++;
		b--; 		
		
		System.out.println(a + " " + b );
		
		Data d1 = new Data(1, 6 , 2022);
		Data d2 = d1; // Atribuição por referencia(Objeto).
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.dataFomat());
		System.out.println(d2.dataFomat());
		
		VoltarDataParaValorPadrao(d2);
		
		System.out.println(d2.dataFomat());
		
		double c = 5;
		TipoPrimitivos(c);
		System.out.println(c);
	}
	
	static void VoltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 12;
		d.ano = 1970;
	}
	static void TipoPrimitivos(Double c) {
		c++;
	}
}
