package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyWillThrowException(3, 7);
        } catch (Exception e) {
            System.out.println("Wrong numbers");
        } finally {
            System.out.println("Is everything ok?");
        }
    }
}
