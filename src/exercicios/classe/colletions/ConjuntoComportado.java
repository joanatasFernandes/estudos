package exercicios.classe.colletions;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
       // Set lista = new HashSet();

        // Set<String> listaAprovados = new HashSet<>(); inser de orden desordenada
         SortedSet<String> listaAprovados = new TreeSet<>(); // Obedeçe a ordem de inserção.
        listaAprovados.add("Anan");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucas");
        listaAprovados.add("Pedro");

        for (String candidatos : listaAprovados) {
            System.out.println(candidatos);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums){
            System.out.println(n);
        }
    }
}
