package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "hello");
        } catch (MessageNotSendException e){
            System.out.println("Message is not send, " + e + " but my program still running very well");
        }
        System.out.println("next process");
    }
}
