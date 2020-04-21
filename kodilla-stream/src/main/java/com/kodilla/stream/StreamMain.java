package com.kodilla.stream;

import com.kodilla.stream.forumuser.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<ForumUser> forumUserList = new Forum().getUserList();
        Map<Integer, ForumUser> resultMap;

        resultMap = forumUserList.stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser->forumUser.getPostCount()>=1)
                .filter(forumUser ->forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .collect(Collectors.toMap(ForumUser::getId,ForumUser->ForumUser));

        resultMap.entrySet().stream().map(entry ->entry.getKey() + " " + entry.getValue()).forEach(System.out::println);
    }
}