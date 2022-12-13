package exercicios.classe.colletions;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adiciona elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peek e Element  -> Obter o próximo elemento da fila (sem remover)
        System.out.println(fila.peek()); // A fila estando vazia ele não da erro , retotna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança retorna exeção
        System.out.println(fila.element());

        /*fila.size();
        fila.clear();
        fila.isEmpty();*/

        //Poll e remove -> obter o próximo elemento da fila e remove

        System.out.println(fila.poll()); // Remove o primeiro elemento da fila (retorna null)
        System.out.println(fila.remove()); // Lança uma exceção

        /*fila.size();
        fila.clear();
        fila.isEmpty();
        fila.cntains(...);
         */
    }
}
