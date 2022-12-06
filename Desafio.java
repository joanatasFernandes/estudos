import java.util.Scanner;

public class Desafio {
    public  static  void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas Notas: ");

        int qtdNotas = entrada.nextInt();
        double [] notas = new double[qtdNotas];
        for (int i = 0; i < notas.length; i++ ){
            System.out.println("informe a nota: " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota : notas){
            total += nota;
        }

        double media = total /  notas.length;
        System.out.println("A média é " + media + "!");
        entrada.close();
    }
}
