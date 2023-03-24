package streams;

import streams.factory.GroupFactory;
import streams.factory.UserFactory;
import streams.operations.StreamCreation;

public class Main {

    public static void main(String[] args) {

        System.out.println(GroupFactory.createGroupsWithUsers(5, 5));
    }

}
