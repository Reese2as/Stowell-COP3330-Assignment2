package org.example.ex38;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        App undertest = new App();
        Integer[] array;
        Integer[] expected = {2,4,6,8};
        String input [] = {"1","2","3","4","5","6","7","8"};
        array = undertest.filterEvenNumbers(input);
        assertArrayEquals(expected,array);
    }
}