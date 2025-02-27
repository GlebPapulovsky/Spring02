package ru.netology.springBootDemo.Repository;

import org.springframework.stereotype.Repository;
import ru.netology.springBootDemo.Authorities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import static ru.netology.springBootDemo.Authorities.*;


@Repository
public class UserRepository {
    private final ConcurrentHashMap<String, String> users = new ConcurrentHashMap<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("Gleb") && password.equals("123")) {
            return new ArrayList<>(Arrays.asList(READ, WRITE, DELETE));
        }
        if (users.contains(user)) {
            return new ArrayList<>(Arrays.asList(READ));
        }
        return new ArrayList<>();
    }
}
