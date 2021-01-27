package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(("Input Text"), (String) -> "ABC " + String + " ABC");
        poemBeautifier.beautify(("Input Text"), (String) -> String.toUpperCase());
        poemBeautifier.beautify(("Input Text"), (String) -> String.toLowerCase());
        poemBeautifier.beautify(("Input Text"), (String) -> String + "!!!");
        poemBeautifier.beautify(("Input Text"), (String) -> String.replaceAll(".(?!$)", "$0 "));


        Forum forum = new Forum();
        Map<Integer, ForumUser> resultOfForum = forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(s -> s.getBirthDate().getYear() < 2000)
                .filter(s -> s.getPostAmount() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, s -> s));

        System.out.println("#elements of map:" + resultOfForum.size());
        resultOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
