package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstName;
    private String lastName;
    private String peselId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;


        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName,lastName,peselId);
    }
}