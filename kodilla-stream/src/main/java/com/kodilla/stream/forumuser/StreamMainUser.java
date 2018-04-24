package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMainUser{

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> mapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostNumers() >= 1)
                .collect((Collectors.toMap(ForumUser::getUserId, Function.identity())));

        System.out.println("Numbers of elements in the map: " + mapOfForumUsers.size());
        mapOfForumUsers.entrySet().stream()
                .map(entry -> "Filtered user ID: " + entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);
    }
}
