package org.example.ex28;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calc() {
        App undertest = new App();
        List<Integer> input = new ArrayList<>();
        int result;
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        result = undertest.calc(input);
        assertEquals(15, result);
    }
}