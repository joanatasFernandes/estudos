package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;//informando que � um numero real inteiro e n�o double
		
		// tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estadoDeFerias = false; // true
		
		// Tipos de caractere
		char status = 'A';//Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de Viages
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas );
		
		System.out.println(id + ": Ganha ->" + salario);
		System.out.println("F�rias" + estadoDeFerias);
		System.out.println("Status; " + status);
	}
}
