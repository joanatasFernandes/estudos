package controle;

public class Break01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.printf("[i] %d\n",  i);
		}
		System.out.println("Fim Do Programa:...");
	}
}
