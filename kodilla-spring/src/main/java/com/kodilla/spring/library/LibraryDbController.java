package com.kodilla.spring.library;

import org.springframework.stereotype.Repository;

@Repository
public final class LibraryDbController {
    public void loadData(){
        System.out.println("Loading data from database");
    }
    public void saveData(){
        System.out.println("Saving data to database");
    }

}
