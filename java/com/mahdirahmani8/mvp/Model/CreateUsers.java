package com.mahdirahmani8.mvp.Model;

/*
    this is emulate to Date Base or Online get Data
    actully this class way of get Data
*/

import java.util.ArrayList;
import java.util.List;

public class CreateUsers {

    public static List<User> createUser() {

        List<User> users = new ArrayList<>();

        users.add(new User("madhi","asdf","fadadsa",55));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",5));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",5));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",25));
        users.add(new User("madhi","asdf","fadadsa",55));
        users.add(new User("madhi","asdf","fadadsa",52));


        return users;
    }
}
