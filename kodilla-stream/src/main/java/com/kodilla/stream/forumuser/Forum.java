package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){

        userList.add(new ForumUser(1, "kacper", 'm', LocalDate.of(1987, 1, 1), 25));
        userList.add(new ForumUser(2, "katarzyna", 'f', LocalDate.of(1988, 3, 12), 44));
        userList.add(new ForumUser(3, "ania", 'f', LocalDate.of(1993, 3, 29), 135));
        userList.add(new ForumUser(4, "tomek", 'm', LocalDate.of(1985, 5, 22), 654));
        userList.add(new ForumUser(5, "filip", 'm', LocalDate.of(1979, 2, 2), 101));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}