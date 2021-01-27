package com.kodilla.testing.library;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Book Directory Test Suite")
public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    static int counter = 0;

    @BeforeEach
    public void beforeEach() {
        counter++;
        System.out.println("Starting test No." + counter);
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("starting tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Tests finished");
    }

    @DisplayName("Test of properly working list")
    @Nested
    class properListTest {
        @DisplayName("List return test")
        @Test
        void testListBooksWithConditionsReturnList() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
            //When
            List<Book> theListOfBook = bookLibrary.listBooksWithCondition("Secret");
            //Then
            Assertions.assertEquals(4, theListOfBook.size());
        }
    }

    @DisplayName("Test of returning empty list")
    @Nested
    class emptyListTest {
        private List<Book> generateListOfBooks(int quantityOfBooks) {
            List<Book> resultList = new ArrayList<>();
            for (int i = 1; i <= quantityOfBooks; i++) {
                Book theBook = new Book("Title " + i, "Author " + i, 1970 + i);
                resultList.add(theBook);
            }
            return resultList;
        }

        @DisplayName("Empty List return if more than 20 characters test")
        @Test
        void testListBooksWithConditionMoreThan20() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultList0Books = new ArrayList<>();
            List<Book> resultList16Books = generateListOfBooks(16);
            List<Book> resultList50Books = generateListOfBooks(50);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))                    // [5]
                    .thenReturn(resultList16Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultList0Books);
            when(libraryDatabaseMock.listBooksWithCondition("fiftyBooks")).thenReturn(resultList50Books);
            //When
            List<Book> theListOf0Books = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOf16Books = bookLibrary.listBooksWithCondition("asojifi");
            List<Book> theListOf50Books = bookLibrary.listBooksWithCondition("fiftyBooks");
            //Then
            Assertions.assertEquals(0, theListOf0Books.size());
            Assertions.assertEquals(16, theListOf16Books.size());
            Assertions.assertEquals(0, theListOf50Books.size());

        }

        @DisplayName("Empty List return if less than 3 characters test")
        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf10Books = generateListOfBooks(10);
            //When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("ss");
            //Then
            Assertions.assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @DisplayName("Books in hands of user test")
    @Nested
    class bookInHandsOff {
        @DisplayName("get list rented by user if he rented 0 books")
        @Test
        void test0BooksRented() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser();
            //When
            int result = bookLibrary.listBooksInHandsOf(libraryUser).size();
            //Then
            Assertions.assertEquals(0, result);
        }

        @DisplayName("get list rented by user if he rented 1 book")
        @Test
        void test1BookRented() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser1Book = new LibraryUser();
            LibraryUser libraryUser5Book = new LibraryUser();
            List<Book> resultListOf1Books = new ArrayList<>();
            List<Book> resultListOf5Books = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            Book book5 = new Book("Secrets of Coding", "Ian Tas", 2002);
            resultListOf1Books.add(book1);
            resultListOf5Books.add(book1);
            resultListOf5Books.add(book2);
            resultListOf5Books.add(book3);
            resultListOf5Books.add(book4);
            resultListOf5Books.add(book5);
            bookLibrary.addBookToOrder(book1);
            bookLibrary.rentABook(libraryUser1Book, book1);
            bookLibrary.addBookToOrder(book1);
            bookLibrary.addBookToOrder(book2);
            bookLibrary.addBookToOrder(book3);
            bookLibrary.addBookToOrder(book4);
            bookLibrary.addBookToOrder(book5);
            bookLibrary.rentABook(libraryUser5Book, book1);


            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1Book)).thenReturn(resultListOf1Books);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5Book)).thenReturn(resultListOf5Books);


            //When
            int result = bookLibrary.listBooksInHandsOf(libraryUser1Book).size();
            //  int result5 = bookLibrary.listBooksInHandsOf(libraryUser5Book).size();
            //Then
            Assertions.assertEquals(1, result);
            // Assertions.assertEquals(5,result5);

        }

        @DisplayName("get list rented by user if he rented 5 books")
        @Test
        void test5BookRented() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser();
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            Book book5 = new Book("Secrets of Coding", "Ian Tas", 2002);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            resultListOfBooks.add(book5);
            bookLibrary.rentABook(libraryUser, book1);
            bookLibrary.rentABook(libraryUser, book2);
            bookLibrary.rentABook(libraryUser, book3);
            bookLibrary.rentABook(libraryUser, book4);
            bookLibrary.rentABook(libraryUser, book5);

            //When

            int result = bookLibrary.listBooksInHandsOf(libraryUser).size();
            //Then
            Assertions.assertEquals(5, result);

        }
    }
}
