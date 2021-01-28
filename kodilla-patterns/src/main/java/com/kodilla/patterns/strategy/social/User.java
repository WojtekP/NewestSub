package com.kodilla.patterns.strategy.social;

public class User {
    public SocialPublisher socialPublisher;
    public String sharePost(String post){
        return socialPublisher.share() +" "+ post;

    }


    public void setPreferences(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
