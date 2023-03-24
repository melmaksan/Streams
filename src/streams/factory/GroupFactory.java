package streams.factory;

import streams.Group;
import streams.User;

import java.util.*;

public class GroupFactory {

    public static List<Group> createGroupsWithUsers(int groupNums, int userNums) {
        List<Group> groups = new ArrayList<>(groupNums);
        for (int i = 0; i < groupNums; i++) {
            Group group = addGroup(groups, i);
            User[] users = createUsersArray(userNums);
            for (User user : users) {
                user.setGroup(group);
            }
            groups.get(i).setUsers(new HashSet<>(Arrays.asList(users)));
        }
        return groups;
    }

    private static Group addGroup(List<Group> groups, int i) {
        Group group = createGroup(i);
        Group.setId(i);
        groups.add(i, group);
        return group;
    }

    public static User[] createUsersArray(int userNums) {
        User[] users = new User[userNums];
        for (int i = 0; i < userNums; i++) {
            users[i] = UserFactory.createUser();
            User.setId(i);
        }
        return users;
    }

    public static Group createGroup(int index) {
        String[] groupNames = {"Alpha", "Beta", "Gamma", "Delta", "Zeta", "Eta"};
        return new Group(groupNames[index]);
    }

}
