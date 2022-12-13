package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in); // recebe o valor de entra pelo usuário no teclado

        System.out.print("Quantas notas: ");
        int qtdeNotas = entrada.nextInt();
        double[] notas = new double[qtdeNotas];// guarda o valor digiado em um array
        // Percorre o array e guarda o valor digitada para cada nota
        for (int i = 0; i < notas.length; i++){
            System.out.print("Informe a nota " + (i + 1) + ": "); // icrementa cada print com +1 e :
            notas[i] = entrada.nextDouble();
        }
        double total = 0; // Soma totas as notas digitadas pelo usuário.
        for (double nota : notas){
            total += nota;
        }
        // Calcula a média do total das notas
        double media = total / notas.length;
        System.out.println("A média é " + media + "!");
         entrada.close();
    }
}
