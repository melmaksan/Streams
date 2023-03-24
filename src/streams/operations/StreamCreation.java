package streams.operations;

import streams.Group;

import java.util.Collection;
import java.util.stream.Stream;

public class StreamCreation {

    public static void createFromCollection(Collection<Group> collection) {
        System.out.println(collection.stream());
    }
}
