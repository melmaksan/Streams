package streams;

import java.util.List;
import java.util.Objects;

public class Group {

    private static final String ID = "G";
    private final String name;
    private List<User> users;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(users, group.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
