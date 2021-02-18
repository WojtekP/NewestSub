package com.kodilla.testing.library;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
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
        private List<Book> generateListOfBooks(int booksQuantity) {
            List<Book> resultList = new ArrayList<>();
            for (int n = 1; n <= booksQuantity; n++){
                Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
        }
        @DisplayName("get list rented by user if he rented 0 books")
        @Test
        void test0BooksRented() {
            //Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser();
            List<Book> resultListOfBooks = new ArrayList<Book>();
            //When
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);
            List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            Assertions.assertEquals(0, theListOfBooks.size());
        }


        @DisplayName("get list rented by user if he rented 1 book")
        @Test
        void test1BookRented() {
            //Given
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser testUser = new LibraryUser();
            List<Book> rented1Book = generateListOfBooks(1);
            when(libraryDatabaseMock.listBooksInHandsOf(testUser)).thenReturn(rented1Book);
            // When
            List<Book> userBooks = bookLibrary.listBooksInHandsOf(testUser);
            // Then
            Assertions.assertEquals(1, rented1Book.size());


        }

        @DisplayName("get list rented by user if he rented 5 books")
        @Test
        void test5BookRented() {
            //Given
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser testUser = new LibraryUser();
            List<Book> rented5Book = generateListOfBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(testUser)).thenReturn(rented5Book);
            // When
            List<Book> userBooks = bookLibrary.listBooksInHandsOf(testUser);
            // Then
            Assertions.assertEquals(5, rented5Book.size());

        }
    }
}
