package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postAmount;

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postAmount=" + postAmount +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostAmount() {
        return postAmount;
    }

    public ForumUser(final int userID, final String userName, final char sex, final LocalDate birthDate, final int postAmount) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postAmount = postAmount;

    }
}
