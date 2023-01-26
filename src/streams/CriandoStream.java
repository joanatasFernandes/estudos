package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Consumer<Integer> printLn = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "Js\n");
        langs.forEach(print);

        String[] maisLangs = {"Phyton ", "Lisp ", "Peral ", "Go\n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLangs = Arrays.asList("c ", "PHP", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);

        Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(printLn);
    }
}
