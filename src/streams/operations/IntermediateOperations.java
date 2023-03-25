package streams.operations;

import streams.Group;
import streams.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void filter(List<Group> collection) {
        System.out.println("\nfilter method: ");
        collection.stream()
                .filter(n -> n.getName().contains("e"))
                .forEach(System.out::println);
    }

    public static void skip(List<Group> collection) {
        System.out.println("\nskip method: ");
        collection.stream()
                .skip(2)
                .forEach(System.out::println);
    }

    public static void distinct(int[] array) {
        System.out.println("\ndistinct method: ");
        Arrays.stream(array)
                .distinct()
                .forEach(System.out::println);
    }

    public static void map(List<Group> collection) {
        System.out.println("\nmap method: ");
        collection.stream()
                .map(Group::getName)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static List<String> peek(List<Group> collection) {
        System.out.println("\npeek method: ");
        return collection.stream()
                .filter(n -> n.getName().length() > 4)
                .peek(System.out::println)
                .map(x -> x.getName() + "_123")
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static void limit(List<Group> collection) {
        System.out.println("\nlimit method: ");
        collection.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    public static void sorted(User[] array) {
        System.out.println("\nsorted method: ");
        Arrays.stream(array)
                .sorted(Comparator.comparing(User::getName)
                        .thenComparing(User::getAge))
                .forEach(System.out::println);
    }

    public static double mapToInt(User[] array) {
        System.out.println("\nmapToInt method: ");
        return Arrays.stream(array)
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    public static void flatMap(List<Group> collection) {
        System.out.println("\nflatMap method: ");
        collection.stream()
                .skip(1).map(Group::getUsers)
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }

    public static long flatMapToInt(List<List<Integer>> collection) {
        System.out.println("\nflatMapToInt method: ");
        return collection.stream()
                .flatMapToInt(list ->
                        list.stream().mapToInt(num -> num))
                .peek(System.out::println)
                .summaryStatistics().getSum();
    }
}
