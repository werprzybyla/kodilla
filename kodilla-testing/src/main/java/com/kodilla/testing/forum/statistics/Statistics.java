package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames();  // list of users names
    int postCount();            // total quantity of forum posts
    int commentCount();         // total quantity of forum comments
}
