package streams.operations;

import streams.Group;
import streams.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void createFromCollection(List<Group> collection) {
        System.out.println("\ncreateFromCollection method: ");
        collection.stream().forEach(System.out::println);
    }

    public static void createFromValues(String str1, String str2, String str3) {
        System.out.println("\ncreateFromValues method: ");
        Stream.of(str1, str2, str3).forEach(System.out::println);
    }
    public static void createWithRange(int start, int end) {
        System.out.println("\ncreateWithRange method: ");
        IntStream.range(start, end).forEach(System.out::println);
    }

    public static void createFromArray(User[] array) {
        System.out.println("\ncreateFromArray method: ");
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void createFromFile(String path) throws IOException {
        System.out.println("\ncreateFromFile method: ");
        Files.lines(Paths.get(path)).forEach(System.out::println);
    }

    public static void createFromChars(String text) {
        System.out.println("\ncreateFromChars method: ");
        text.chars().forEach(System.out::println);
    }

    public static void createWithBuilder(String str1, String str2, String str3) {
        System.out.println("\ncreateWithBuilder method: ");
        Stream.builder().add(str1).add(str2).add(str3).build().forEach(System.out::println);
    }

    public static void createParallelStream(List<Group> collection) {
        System.out.println("\ncreateParallelStream method: ");
        collection.parallelStream().forEach(System.out::println);
    }

    public static void createWithIterate(int number) {
        System.out.println("\ncreateWithIterate method: ");
        Stream.iterate(number, n -> n + 1).limit(10).forEach(System.out::println);
    }

    public static void createWithGenerate(String text) {
        System.out.println("\ncreateWithGenerate method: ");
        Stream.generate(() -> text).limit(10).forEach(System.out::println);
    }
}
