package org.example.ex32;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createRandomNumber() {
        App undertest = new App();
        for(int i = 0; i < 10; i++)
        {
            int result = undertest.CreateRandomNumber(1);
            assertEquals(true,(result<=10&&result>=1));
            result = undertest.CreateRandomNumber(2);
            assertEquals(true,(result<=100&&result>=1));
            result = undertest.CreateRandomNumber(3);
            assertEquals(true,(result<=1000&&result>=1));
        }
    }
}