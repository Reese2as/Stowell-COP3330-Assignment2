package org.example.ex25;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    void passwordValidator()
    {
        App undertest = new App();
        String input;
        int result;
        input = "12345";
        result = undertest.passwordValidator(input);
        assertEquals(1, result);

        input = "abcdef";
        result = undertest.passwordValidator(input);
        assertEquals(2, result);

        input = "abc123xyz";
        result = undertest.passwordValidator(input);
        assertEquals(3, result);

        input = "1337h@xor!";
        result = undertest.passwordValidator(input);
        assertEquals(4, result);
    }
}