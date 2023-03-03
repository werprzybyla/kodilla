package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers[] ={3, 4, 9, 15, 7, 6, 33, 5};

        //When
        double actualAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(10.25, actualAverage);
    }
}
