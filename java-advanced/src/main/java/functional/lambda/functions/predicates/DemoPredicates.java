package functional.lambda.functions.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Predicate functional interface is a specialization of a Function that
 * receives a generified value and returns a boolean. A typical use case
 * of the Predicate lambda is to filter a collection of values
 */
public class DemoPredicates {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        List<String> namesWithA = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());

        namesWithA.forEach(System.out::println);
    }
}
