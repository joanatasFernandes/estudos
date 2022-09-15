package classe;

public class DataTest  {
	public static void main(String[] args) {
		//Cria um objeto e  instacia um atributo da classe data; 
		Data d1 = new Data();
		var  d2 = new Data(07, 11, 2021);
		 /*d1.dia = 7;
		 d1.mes = 11;
		 d1.ano = 2021;*/
		
		 
		 
		 
		 System.out.println(d1.dataFomat());
		 System.out.println(d2.dataFomat());		 
		 d1.dataFormatada();
	}
}
