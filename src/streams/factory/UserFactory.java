package streams.factory;

import streams.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UserFactory {

    public static User createUser() {
        return new User(randomName(), randomAge(), );
    }

    private static int randomAge() {
        return 20 + (int)(Math.random()*20);
    }

    private static String randomName() {
        List<String> nameList = Arrays.asList("Vasyl", "Anna", "Max",
                "Alex", "Nina", "Pavlo", "Lisa", "Stepan", "Tanya", "Ira");
        int index = (int)(Math.random()*10);
        return nameList.get(index);
    }

}
