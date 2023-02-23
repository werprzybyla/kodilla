package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(123, "Anna", 'F', LocalDate.of(1992,10,2), 4));
        forumUserList.add(new ForumUser(234, "Maciej", 'M', LocalDate.of(2000, 4, 13), 16));
        forumUserList.add(new ForumUser(345, "Piotr", 'M', LocalDate.of(2013, 6, 18), 0));
        forumUserList.add(new ForumUser(567, "Iga", 'F', LocalDate.of(1998, 5, 23), 12));
        forumUserList.add(new ForumUser(678, "Olaf", 'M', LocalDate.of(2005, 11, 3), 7));
        forumUserList.add(new ForumUser(891, "Kasia", 'F', LocalDate.of(2013, 8, 24), 24));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
