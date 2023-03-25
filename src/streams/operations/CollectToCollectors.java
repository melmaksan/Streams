package streams.operations;

import streams.Group;
import streams.User;

import java.util.*;
import java.util.stream.Collectors;

public class CollectToCollectors {

    public static void toList(List<Group> collection) {
        System.out.println("\ntoList method: ");
        collection.stream()
                .filter(n -> n.getName().length() > 4)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void toCollection(List<Group> collection) {
        System.out.println("\ntoCollection method: ");
        collection.stream()
                .filter(n -> n.getName().length() > 4)
                .collect(Collectors.toCollection(LinkedList::new))
                .forEach(System.out::println);
    }

    public static void toSet(List<Group> collection) {
        System.out.println("\ntoSet method: ");
        collection.stream()
                .filter(n -> n.getName().length() > 4)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public static void toMap(List<Group> collection) {
        System.out.println("\ntoMap method: ");
        System.out.println("map: " + collection.stream()
                .collect(Collectors.toMap(Group::getName,
                        Group::getUsers)));
    }

    public static void toConcurrentMap(List<Group> collection) {
        System.out.println("\ntoConcurrentMap method: ");
        System.out.println("concurrent map: " + collection.stream()
                .collect(Collectors.toConcurrentMap
                        (k -> k.getName().charAt(0),
                                v -> v.getName().toUpperCase())));
    }

    public static void averagingDouble(List<Group> collection) {
        System.out.println("\naveragingDouble method: ");
        System.out.println("average age after decrease: " +
                collection.stream()
                        .map(Group::getUsers)
                        .flatMap(Collection::stream)
                        .collect(Collectors.averagingDouble
                                (k -> k.getAge() - 5)));
    }

    public static void summingInt(List<Group> collection) {
        System.out.println("\nsummingInt method: ");
        System.out.println("summary age after increment: " +
                collection.stream()
                        .map(Group::getUsers)
                        .flatMap(Collection::stream)
                        .collect(Collectors.summingInt
                                (a -> a.getAge() + 3)));
    }

    public static void summarizingInt(List<Group> collection) {
        System.out.println("\nsummarizingInt method: ");
        System.out.println("summary statistics: " +
                collection.stream()
                        .map(Group::getUsers)
                        .flatMap(Collection::stream)
                        .collect(Collectors.summarizingInt(User::getAge)));
    }

    public static void groupingBy(List<Group> collection) {
        System.out.println("\ngroupingBy method: ");
        System.out.println("grouping by user name: " +
                collection.stream()
                        .map(Group::getUsers)
                        .flatMap(Collection::stream)
                        .collect(Collectors.groupingBy(User::getName,
                                Collectors.averagingInt(User::getAge))));
    }

    public static void mapping(List<Group> collection) {
        System.out.println("\nmapping method: ");
        System.out.println("mapping by group: " +
                collection.stream()
                        .map(Group::getUsers)
                        .flatMap(Collection::stream)
                        .collect(Collectors.mapping(User::getGroup,
                                        Collectors.toSet())));
    }

    public static void partitioningBy(List<Group> collection) {
        System.out.println("\npartitioningBy method: ");
        System.out.println("partitioning by age: " +
                collection.stream()
                        .map(Group::getUsers)
                        .flatMap(Collection::stream)
                        .collect(Collectors.partitioningBy
                                (v -> v.getAge() > 30)));
    }
}
