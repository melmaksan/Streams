package streams;

import java.util.Objects;
import java.util.Set;

public class Group {

    private static long id;
    private final String name;
    private Set<User> users;

    public Group(String name) {
        this.name = name;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Group.id = id;
    }

    public String getName() {
        return name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
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
        return Objects.hash(id, name, users);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
