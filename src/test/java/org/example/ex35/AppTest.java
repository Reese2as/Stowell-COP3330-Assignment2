package org.example.ex35;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createRandomNumber() {
        App undertest = new App();

        int result;
        List<String> Names = new ArrayList<String>();
        Names.add("Homer");
        Names.add("Bart");
        Names.add("Maggie");
        Names.add("Lisa");
        Names.add("Moe");
        result = undertest.CreateRandomNumber(Names);
        assertEquals(true, (result <= 4 && result >= 0));
    }

}