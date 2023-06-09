package streams;

import streams.factory.GroupFactory;
import streams.factory.UserFactory;
import streams.operations.CollectToCollectors;
import streams.operations.IntermediateOperations;
import streams.operations.StreamCreation;
import streams.operations.TerminalOperations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        //StreamCreation methods

//        StreamCreation.createFromCollection(GroupFactory.createGroupsWithUsers(3, 3));
//        StreamCreation.createWithRange(10, 20);
//        StreamCreation.createFromArray(GroupFactory.createUsersArray(5));
//        StreamCreation.createParallelStream(GroupFactory.createGroupsWithUsers(2, 2));
//        StreamCreation.createFromChars("qwerty");
//        StreamCreation.createFromFile("src/file.txt");
//        StreamCreation.createFromValues("qaz", "xsw", "edc");
//        StreamCreation.createWithBuilder("qwe", "rty", "uio");
//        StreamCreation.createWithIterate(1);
//        StreamCreation.createWithGenerate("asd");

        //IntermediateOperations methods

//        IntermediateOperations.filter(GroupFactory.createGroupsWithUsers(5, 5));
//        IntermediateOperations.limit(GroupFactory.createGroupsWithUsers(4, 4));
//        IntermediateOperations.peek(GroupFactory.createGroupsWithUsers(5, 5));
//        IntermediateOperations.skip(GroupFactory.createGroupsWithUsers(4, 4));
//        IntermediateOperations.distinct(new int[]{1, 2, 7, 5, 4, 2, 5, 6});
//        IntermediateOperations.sorted(GroupFactory.createUsersArray(7));
//        IntermediateOperations.map(GroupFactory.createGroupsWithUsers(3, 3));
//        IntermediateOperations.mapToInt(GroupFactory.createUsersArray(7));
//        IntermediateOperations.flatMap(GroupFactory.createGroupsWithUsers(4, 4));
//
//        List<Integer> childList1 = Arrays.asList(1, 2, 3);
//        List<Integer> childList2 = Arrays.asList(4, 5, 6);
//        List<Integer> childList3 = Arrays.asList(7, 8, 9, 10);
//        List<List<Integer>> mainList = Arrays.asList(childList1, childList2, childList3);
//        IntermediateOperations.flatMapToInt(mainList);

        //TerminalOperations methods

//        TerminalOperations.toArray(GroupFactory.createGroupsWithUsers(3, 3));
//        TerminalOperations.anyMatch(GroupFactory.createGroupsWithUsers(4, 4));
//        TerminalOperations.count(GroupFactory.createGroupsWithUsers(5, 5));
//        TerminalOperations.noneMatch(GroupFactory.createGroupsWithUsers(5, 5));
//        TerminalOperations.allMatch(GroupFactory.createGroupsWithUsers(5, 5));
//        TerminalOperations.forEach(GroupFactory.createGroupsWithUsers(2, 2));
//        TerminalOperations.forEachOrdered(GroupFactory.createGroupsWithUsers(3, 3));
//        TerminalOperations.findAny(GroupFactory.createGroupsWithUsers(4, 4));
//        TerminalOperations.findFirst(GroupFactory.createGroupsWithUsers(4, 4));
//        TerminalOperations.max(GroupFactory.createGroupsWithUsers(5, 5));
//        TerminalOperations.min(GroupFactory.createGroupsWithUsers(5, 5));

        //CollectToCollectors methods

//        CollectToCollectors.toList(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.toSet(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.toMap(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.toConcurrentMap(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.toCollection(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.averagingDouble(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.summingInt(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.summarizingInt(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.groupingBy(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.mapping(GroupFactory.createGroupsWithUsers(5, 5));
//        CollectToCollectors.partitioningBy(GroupFactory.createGroupsWithUsers(5, 5));
    }
}
