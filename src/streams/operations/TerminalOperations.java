package streams.operations;

import streams.Group;

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

    public static long count(List<Group> collection) {
        System.out.println("\ncount method: ");
        return collection.stream()
                .filter(n -> n.getName().contains("e"))
                .count();
    }

    public static boolean anyMatch(List<Group> collection) {
        System.out.println("\nanyMatch method: ");
        return collection.stream()
                .filter(n -> n.getName().contains("e"))
                .anyMatch(n -> n.getName().equals("Beta"));
    }

    public static boolean noneMatch(List<Group> collection) {
        System.out.println("\nnoneMatch method: ");
        return collection.stream()
                .filter(n -> n.getName().contains("e"))
                .noneMatch(n -> n.getName().equals("Alpha"));
    }

    public static boolean allMatch(List<Group> collection) {
        System.out.println("\nallMatch method: ");
        return collection.stream()
                .filter(n -> n.getName().contains("e"))
                .allMatch(n -> n.getName().contains("a"));
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

    public static String[] toArray(List<Group> collection) {
        System.out.println("\ntoArray method: ");
        return collection.stream()
                .map(Group::getName)
                .map(String::toUpperCase)
                .toArray(String[]::new);
    }
}
