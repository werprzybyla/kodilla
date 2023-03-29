package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("Maja");

        Optional<User> optionalUser = Optional.ofNullable(user);

        //String username = optionalUser.orElse(new User("default user")).getName();
        //System.out.println(username);

        optionalUser.ifPresent(u -> System.out.println(u.getName()));
    }
}
