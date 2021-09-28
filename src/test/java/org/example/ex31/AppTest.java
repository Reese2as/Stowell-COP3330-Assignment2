package org.example.ex31;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calc() {
        App undertest = new App();
        int input, input2, input3;
        input = 22;
        input2 = 65;
        input3 = 55;
        double result;
        result = undertest.calc(input, input2, input3);
        assertEquals(138.15, result);
    }
}