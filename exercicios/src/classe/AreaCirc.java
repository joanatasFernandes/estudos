package classe;

public class AreaCirc {
	public static void main(String[] args) {
		double raio;
		final static double PI = 3.1415;

	public AreaCirc(double raioInicial) {
			raio = raioInicial;
		}
		double area() {
			return PI * Math.pow(raio, 2);
		}
		//Com esse metodo nao precisa cria instancia de classe para acessar o metodo.
		static double area(double raio) {
			return PI * Math.pow(raio, 2);
		}
	}

}
