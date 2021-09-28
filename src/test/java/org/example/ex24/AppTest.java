package org.example.ex24;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isAnagram() {
        App undertest = new App();
        String input,input2;
        boolean result;
        input = "tone";
        input2 = "note";
        result = undertest.isAnagram(input.toCharArray(), input2.toCharArray());
        assertEquals(true, result);

        input = "Programmer";
        input2 = "sadness";
        result = undertest.isAnagram(input.toCharArray(), input2.toCharArray());
        assertEquals(false, result);
    }
}