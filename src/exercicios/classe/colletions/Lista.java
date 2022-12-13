package exercicios.classe.colletions;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        Usuario user1 = new Usuario("Ana");
        lista.add(user1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome); // Concegue acessar pelo indice

        System.out.println(">>>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.printf("Tem ?%s%n", lista.contains(new Usuario("Lia")));


        for (Usuario u : lista){
            System.out.println(u);
        }
    }
}
