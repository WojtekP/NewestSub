package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User Timmy = new Millenials();
        User John = new YGeneration();
        User Tony = new ZGeneration();
        //When
        String timmyAnswer = Timmy.sharePost("I love Snapchat");
        System.out.println(timmyAnswer);
        String johnAnswer = John.sharePost("I love Twitter");
        System.out.println(johnAnswer);
        String tonyAnswer = Tony.sharePost("I love Facebook");
        System.out.println(tonyAnswer);
        //Then
        Assertions.assertEquals("Snapchat: I love Snapchat",timmyAnswer);
        Assertions.assertEquals("Twitter: I love Twitter",johnAnswer);
        Assertions.assertEquals("Facebook: I love Facebook",tonyAnswer);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //given
        User Timmy = new Millenials();

        //when
        String timmyFirstAnswer = Timmy.sharePost("I love Snapchat");
        System.out.println(timmyFirstAnswer);
        Timmy.setPreferences(new FacebookPublisher());
        String timmySecondAnswer = Timmy.sharePost("I love Facebook now");
        System.out.println(timmySecondAnswer);
        //Then
        Assertions.assertEquals("Snapchat: I love Snapchat",timmyFirstAnswer);
        Assertions.assertEquals("Facebook: I love Facebook now",timmySecondAnswer);

    }
}
