package org.example.ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calc() {
        App undertest = new App();
        int input;
        int result;
        input = 4;
        result = undertest.calc(input);
        assertEquals(18, result);
    }
}