package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Statistics Test Suite")
public class StatisticsTestSuite {
    private int counter = 0;
    @Mock
    private Statistics StatisticsMock;

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

    @DisplayName("Post tests")
    @Nested
    class PostTests {
        private int posts = 0;

        private int generateListOfPosts(int quantityOfPost) {
            for (int i = 0; i < quantityOfPost; i++) {
                posts++;
            }
            return posts;
        }

        @DisplayName("100 Post test")
        @Test
        public void post100() {
            ForumStatistics forumStatistics = new ForumStatistics(StatisticsMock);
            int postNum = generateListOfPosts(100);
            //        when(StatisticsMock.postsCount()).thenReturn(postNum);
            int result = forumStatistics.postsCount();
            Assertions.assertEquals(100, result);

        }

        @DisplayName("0 Post test")
        @Test
        public void post0() {
            ForumStatistics forumStatistics = new ForumStatistics(StatisticsMock);
            int postNum = generateListOfPosts(0);
            when(StatisticsMock.postsCount()).thenReturn(postNum);
            int result = forumStatistics.postsCount();
            Assertions.assertEquals(0, result);

        }


    }

    @DisplayName("Comments tests")
    @Nested
    class CommentsTest {
        private int posts = 0;
        private int comments = 0;

        private int generateListOfPosts(int quantityOfPost) {
            for (int i = 0; i < quantityOfPost; i++) {
                posts++;
            }
            return posts;
        }

        private int generateListOfComments(int quantityOfComments) {
            for (int i = 0; i < quantityOfComments; i++) {
                comments++;
            }
            return comments;
        }

        @DisplayName("0 comments test")
        @Test
        public void comment0test() {
            ForumStatistics forumStatistics = new ForumStatistics(StatisticsMock);
            int commentNum = generateListOfComments(0);
            when(StatisticsMock.commentsCount()).thenReturn(commentNum);
            int result = forumStatistics.commentsCount();
            Assertions.assertEquals(0, result);

        }

        @DisplayName("less than post comments test")
        @Test
        public void lessThanPostComments() {
            ForumStatistics forumStatistics = new ForumStatistics(StatisticsMock);
            int commentNum = generateListOfComments(2);
            int postNum = generateListOfPosts(10);
//            when(StatisticsMock.commentsCount()).thenReturn(commentNum);
            //         when(StatisticsMock.postsCount()).thenReturn(postNum);
            int resultComments = forumStatistics.commentsCount();
            int resultPosts = forumStatistics.postsCount();
            boolean result = (resultComments < resultPosts);
            Assertions.assertTrue(result);

        }

        @DisplayName("more than posts comments test")
        @Test
        public void moreThanPostComments() {
            ForumStatistics forumStatistics = new ForumStatistics(StatisticsMock);
            int commentNum = generateListOfComments(10);
            int postNum = generateListOfPosts(2);
            //          when(StatisticsMock.commentsCount()).thenReturn(commentNum);
            //         when(StatisticsMock.postsCount()).thenReturn(postNum);
            int resultComments = forumStatistics.commentsCount();
            int resultPosts = forumStatistics.postsCount();
            boolean result = (resultComments < resultPosts);
            Assertions.assertTrue(result);

        }
    }

    @DisplayName("user tests")
    @Nested
    class UserTest {
        private List<String> generateListOfUsers(int quantityOfUsers) {
            List<String> users = new ArrayList<>();
            for (int i = 0; i < quantityOfUsers; i++) {
                users.add("User No." + i);
            }
            return users;
        }

        @DisplayName("100 user test")
        @Test
        public void UserTests100() {
            ForumStatistics forumStatistics = new ForumStatistics(StatisticsMock);
            List<String> userList = generateListOfUsers(100);
//                when(StatisticsMock.usersNames()).thenReturn(userList);
            int result = forumStatistics.usersNames().size();
            Assertions.assertEquals(100, result);

        }

        @DisplayName("0 user test")
        @Test
        public void UserTests0() {
            ForumStatistics forumStatistics = new ForumStatistics(StatisticsMock);
            List<String> userList = generateListOfUsers(0);
            when(StatisticsMock.usersNames()).thenReturn(userList);
            int result = forumStatistics.usersNames().size();
            Assertions.assertEquals(0, result);

        }

    }

}


