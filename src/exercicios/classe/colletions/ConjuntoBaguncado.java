package exercicios.classe.colletions;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "uncheked" })
public class ConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet<java.io.Serializable> conjunto = new HashSet<>();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1);// int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println(" Tamanho do conjuto é :" + conjunto.size());
        conjunto.add("teste");
        System.out.println(" Tamanho do conjuto é :" + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println(" Tamanho do conjuto é :" + conjunto.size());
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}
