package org.example.ex33;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createRandomNumber() {
        App undertest = new App();
        int result;
        result = undertest.CreateRandomNumber();
        assertEquals(true,(result<=4&&result>=1));
    }
}