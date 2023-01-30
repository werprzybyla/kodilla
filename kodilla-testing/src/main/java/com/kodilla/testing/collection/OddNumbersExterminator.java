package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(numbers);
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for(Integer currentNumber : numbers) {
            if(currentNumber % 2 == 0) {
                evenNumbers.add(currentNumber);
            }
        }
        return evenNumbers;
    }
}