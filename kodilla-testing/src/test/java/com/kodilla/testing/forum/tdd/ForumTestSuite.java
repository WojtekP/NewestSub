package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
@DisplayName("TDD: Forum Test Suite ")
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    private static void beforeAllTests() {
        System.out.println("Starting forum test suite");
    }

    @BeforeEach
    private void beforeEach() {
        testCounter++;
        System.out.println("Starting test No." + testCounter);
    }

    @AfterAll
    private static void afterAll() {
        System.out.println("Testing ended");
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestPosts {
        @DisplayName("Adding post test")
        @Test
        void testAddPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
            //When
            forumUser.addPost("mrSmith", "First Post");
            //Then
            Assertions.assertEquals(1, forumUser.getPostQuantity());
        }

        @DisplayName("Getting post test")
        @Test
        void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
            ForumPost thePost = new ForumPost("First Post", "mrSmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPost(0);
            //Then
            Assertions.assertEquals(thePost, retrievedPost);
        }

        @DisplayName("Removing post when there is no posts test")
        @Test
        void testNoPostRemove() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
            ForumPost thePost = new ForumPost("First Post", "mrSmith");
            //When
            boolean result = forumUser.removePost(thePost);
            //Then
            Assertions.assertFalse(result);
        }

        @DisplayName("Veryfying if post were deleted correctly")
        @Test
        void testPostRemove() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
            ForumPost thePost = new ForumPost("First Post", "mrSmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //When
            boolean result = (forumUser.removePost(thePost));
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostQuantity());
        }
    }

    @Nested
    @DisplayName("Comment tests")
    class CommentTests {
        @DisplayName("Adding comment test")
        @Test
        void testAddComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "John");
            ForumPost thePost = new ForumPost("First Post", "mrSmith");
            //When
            forumUser.addComment(thePost, "mrSmith", "This is my first comment");
            //Then
            Assertions.assertEquals(1, forumUser.getCommentsQuantity());
        }

        @DisplayName("Getting comment test")
        @Test
        void testGetComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "JohnSmith");
            ForumPost thePost = new ForumPost("First Post", "mrSmith");
            ForumComment theComment = new ForumComment(thePost, "This is my first comment", "mrSmith");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //When
            ForumComment retrievedComment;
            retrievedComment = forumUser.getComment(0);
            //Then
            Assertions.assertEquals(theComment, retrievedComment);
        }

        @DisplayName("Removing comment when there is no comments test")
        @Test
        void testNoCommentRemove() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
            ForumPost thePost = new ForumPost("First Post", "mrSmith");
            ForumComment theComment = new ForumComment(thePost, "This is my first comment", "mrSmith");
            //When
            boolean result = forumUser.removeComment(theComment);
            //Then
            Assertions.assertFalse(result);
        }

        @DisplayName("Veryfying if comment were deleted correctly")
        @Test
        void testCommentRemove() {
            //Given
            ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
            ForumPost thePost = new ForumPost("First Post", "mrSmith");
            ForumComment theComment = new ForumComment(thePost, "This is my first comment", "mrSmith");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //When
            boolean result = forumUser.removeComment(theComment);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }
    }
}