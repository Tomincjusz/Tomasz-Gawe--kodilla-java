package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    public List<ForumUser> getForumUserList() {
        List<ForumUser> forumUserList = new ArrayList<>();

        forumUserList.add(new ForumUser(11, "Tomek", 'M', 1989, 1, 12, 20));
        forumUserList.add(new ForumUser(22, "Rychu", 'M', 1999, 2, 13, 6));
        forumUserList.add(new ForumUser(33, "Lysa", 'K', 2000, 12, 1, 16));
        forumUserList.add(new ForumUser(44, "StarLord", 'M', 1993, 3, 24, 26));
        forumUserList.add(new ForumUser(55, "Venom", 'M', 1986, 11, 17, 11));
        forumUserList.add(new ForumUser(66, "Igor", 'M', 1982, 8, 2, 55));
        forumUserList.add(new ForumUser(77, "Goro", 'K', 1999, 6, 12, 14));
        forumUserList.add(new ForumUser(88, "Malpa", 'M', 1991, 3,12, 13));
        forumUserList.add(new ForumUser(99, "Gargamel", 'M', 2001, 2, 16, 5));
        forumUserList.add(new ForumUser(00, "Wiechu", 'M', 1987, 8, 16, 0));

        return new ArrayList<>(forumUserList);
    }
}
