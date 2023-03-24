package streams.factory;

import streams.Group;
import streams.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupFactory {

    public static List<Group> createGroupsWithUsers(int groupNums, int userNums) {
        List<Group> groups = new ArrayList<>(groupNums);
        int count = 0;
        for (int i = 0; i < groupNums; i++) {
            Group group = createGroup(count);
            User[] users = createUsersArray(userNums);
            for (User user : users) {
                user.setGroup(group);
            }
            groups.add(i, group);
            groups.get(i).setUsers(Arrays.asList(users));
            count++;
        }
        return groups;
    }

    public static User[] createUsersArray(int userNums) {
        User[] users = new User[userNums];
        for (int i = 0; i < userNums; i++) {
            users[i] = UserFactory.createUser();
        }
        return users;
    }

    private static String randomName(int index) {
        String[] groupNames = {"Alpha", "Beta", "Gamma", "Delta", "Zeta", "Eta"};
        return groupNames[index];
    }

    public static Group createGroup(int index) {
        return new Group(randomName(index));
    }
}
