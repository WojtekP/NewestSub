package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;
    private List<LibraryUser> libraryUserList = new ArrayList<>();
    private List<Book> borrowed = new ArrayList<>();
    private Map<LibraryUser,List<Book>> books = new HashMap<>();
    private List<Book> addedBooks = new ArrayList<>();

    public  BookLibrary(LibraryDatabase libraryDatabase){
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        if(titleFragment.length()<3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if(resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){

        List<Book> answer = books.get(libraryUser);
        List<Book> emptyList = new ArrayList<>();
        if(answer == null){
            answer = emptyList;
        }
        return answer;

    }
    boolean rentABook(LibraryUser libraryUser, Book book){

        addedBooks.add(book);
        books.put(libraryUser,addedBooks);
        return true;
    };
}
