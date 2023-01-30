package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Begin test case");
    }

    @AfterEach
    public void after() {
        System.out.println("End test case");
    }

    @DisplayName("When created list is empty, then numbers.size should return 0")
    @Test
     void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        int expectedResult = 0;
        int actualResult = (exterminator.exterminate(numbers)).size();

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @DisplayName("When there are are both even and odd numbers, then numbers.size should return amount of even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        Integer[] numbersForTest = new Integer[] {13, 24, 35, 2, 16, 1, 84, 63, 26, 44};
        List<Integer> numbers = Arrays.asList(numbersForTest);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        int expectedResult = 6;
        int actualResult = (exterminator.exterminate(numbers)).size();

        //Then
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
