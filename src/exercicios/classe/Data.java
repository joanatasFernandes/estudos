package classe;

public class Data {
	int ano;
	int mes;
	int dia;
	
	 Data(int anoInic, int mesInic, int diaInic){
		this.ano = anoInic;
		this.mes = mesInic;
		this.dia = diaInic;		
		 
	}
	
	Data(){
		//ano = 1970;
		//mes = 01;
		//dia = 01;
		this(1, 1, 1970);
	}

	String dataFomat() {
	final	String formato ="%d/%d/%d";
		return String.format(formato,ano, mes,dia );
	}
	// esse metodo não ira funcionar dentro de outra plicação fora do termminal;
	 void dataFormatada() {
		 System.out.printf(this.dataFomat());
	}
	
}
