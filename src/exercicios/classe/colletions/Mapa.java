package exercicios.classe.colletions;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(4));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(3));
        System.out.println(usuarios.remove(3));
        System.out.println(usuarios.remove(2,"Arthur"));

        for (int chave : usuarios.keySet()){
            System.out.println(chave);
        }

        for (String valor : usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro  : usuarios.entrySet()){
            System.out.print(registro.getKey() + " ===> ");
            System.out.println(registro.getValue());
        }

    }
}
