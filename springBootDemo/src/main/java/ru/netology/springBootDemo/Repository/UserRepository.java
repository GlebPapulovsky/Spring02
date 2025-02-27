package ru.netology.springBootDemo.Repository;

import org.springframework.stereotype.Repository;
import ru.netology.springBootDemo.Authorities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ru.netology.springBootDemo.Authorities.*;


@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("Gleb")&& password.equals("123")){
            return new ArrayList<>(Arrays.asList(READ, WRITE, DELETE));
        }
        return new ArrayList<>(Arrays.asList(READ));
    }
}
