package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();
    public List<ForumUser> getUserList(){
        userList.add(new ForumUser(1,"Jack",'M',LocalDate.of(1992,12,25),14));
        userList.add(new ForumUser(2,"Jenny",'F',LocalDate.of(2010,11,13),2));
        userList.add(new ForumUser(3,"Mark",'M',LocalDate.of(2007,11,13),5));
        userList.add(new ForumUser(4,"Mariette",'F',LocalDate.of(2001,11,13),0));
        userList.add(new ForumUser(5,"Claudette",'F',LocalDate.of(2000,11,13),1));
        userList.add(new ForumUser(6,"Jennifer",'F',LocalDate.of(1999,11,13),1));
        userList.add(new ForumUser(7,"Tom",'M',LocalDate.of(1997,11,13),12));
        userList.add(new ForumUser(8,"John",'M',LocalDate.of(1995,11,13),150));
        userList.add(new ForumUser(9,"Terry",'M',LocalDate.of(1992,11,13),1));
        userList.add(new ForumUser(10,"Beatrice",'F',LocalDate.of(1991,11,13),0));
        return userList;

    }
}
