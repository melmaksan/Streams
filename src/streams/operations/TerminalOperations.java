package streams.operations;

import streams.Group;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TerminalOperations {

    public static void findFirst(List<Group> collection) {
        System.out.println("\nfindFirst method: ");
        collection.stream()
                .filter(n -> n.getName().contains("e"))
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void findAny(List<Group> collection) {
        System.out.println("\nfindAny method: ");
        collection.stream()
                .filter(n -> n.getName().contains("e"))
                .findAny()
                .ifPresent(System.out::println);
    }

    public static void count(List<Group> collection) {
        System.out.println("\ncount method: ");
        System.out.println(collection.stream()
                .filter(n -> n.getName().contains("e"))
                .count());
    }

    public static void anyMatch(List<Group> collection) {
        System.out.println("\nanyMatch method: ");
        System.out.println(collection.stream()
                .filter(n -> n.getName().contains("e"))
                .anyMatch(n -> n.getName().equals("Beta")));
    }

    public static void noneMatch(List<Group> collection) {
        System.out.println("\nnoneMatch method: ");
        System.out.println(collection.stream()
                .filter(n -> n.getName().contains("e"))
                .noneMatch(n -> n.getName().equals("Alpha")));
    }

    public static void allMatch(List<Group> collection) {
        System.out.println("\nallMatch method: ");
        System.out.println(collection.stream()
                .filter(n -> n.getName().contains("e"))
                .allMatch(n -> n.getName().contains("a")));
    }

    public static void min(List<Group> collection) {
        System.out.println("\nmin method: ");
        collection.stream()
                .filter(n -> n.getName().contains("e"))
                .min(Comparator.comparing(Group::getName))
                .ifPresent(System.out::println);
    }

    public static void max(List<Group> collection) {
        System.out.println("\nmax method: ");
        collection.stream()
                .filter(n -> n.getName().contains("e"))
                .max(Comparator.comparing(Group::getName))
                .ifPresent(System.out::println);
    }

    public static void forEach(List<Group> collection) {
        System.out.println("\nforEach method: ");
        collection.forEach(System.out::println);
    }

    public static void forEachOrdered(List<Group> collection) {
        System.out.println("\nforEachOrdered method: ");
        collection.stream().forEachOrdered(System.out::println);
    }

    public static void toArray(List<Group> collection) {
        System.out.println("\ntoArray method: ");
        System.out.println(Arrays.toString
                (collection.stream()
                .map(Group::getName)
                .map(String::toUpperCase)
                .toArray(String[]::new)));
    }
}
