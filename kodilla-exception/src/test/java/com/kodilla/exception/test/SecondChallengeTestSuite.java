package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuite {

    @Test
    void testProbablyWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(1.5, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(2, 1.6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyWillThrowException(0.9, 1.6)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1, 3)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyWillThrowException(1.9, 3))
        );
    }
}
