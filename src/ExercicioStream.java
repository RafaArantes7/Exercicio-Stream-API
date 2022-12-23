import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioStream {
        public static void main(String[] args) {
                List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

                System.out.println("Imprima todos os elementos dessa lista de String: ");
                numerosAleatorios.forEach(s -> System.out.println(s));

                System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
                numerosAleatorios.stream()
                                .limit(5)
                                .collect(Collectors.toSet())
                                .forEach(System.out::println);

                System.out.println("Transforme esta lista de String em uma lista de numeros inteiros. ");
                List<Integer> collectList = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

                System.out.println("Pegue os numeros parede e maiores que 2 e coloque em uma lista: ");
                List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .filter(i -> (i % 2 == 0 && i > 2))
                                .collect(Collectors.toList());
                System.out.println(listParesMaioresQue2);

                System.out.println("Mostre a média dos numeros: ");
                numerosAleatorios.stream()
                                .mapToInt(Integer::parseInt)
                                .average()
                                .ifPresent(System.out::println);

                System.out.println("Remova os valores impares: ");
                numerosAleatorios.removeIf(i -> (i % 2 != 0));
                System.out.println(numerosAleatorios);

        }

}
