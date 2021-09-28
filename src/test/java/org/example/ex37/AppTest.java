package org.example.ex37;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void randLetters() {
        int i = 8;
        ArrayList<Character> letters;
        App undertest = new App();
        letters = undertest.RandLetters(i);
        assertEquals(8, letters.size());
    }

    @Test
    void randChar() {
        int i = 2;
        ArrayList<Character> chars;
        App undertest = new App();
        chars = undertest.RandChar(i);
        assertEquals(2, chars.size());
    }

    @Test
    void randNum() {
        int i = 2;
        ArrayList<Character> nums;
        App undertest = new App();
        nums = undertest.RandNum(i);
        assertEquals(2, nums.size());
    }

    @Test
    void generatePassword() {
        int Chars = 2;
        int Nums = 2;
        int Letters = 8;
        App undertest = new App();
        String password = undertest.GeneratePassword(undertest.RandChar(Chars),undertest.RandNum(Nums),undertest.RandLetters(Letters));
        int Numbers = 0, Specials = 0, Letterscomp = 0;
        password = password.replace("[", "").replace("]", "").replace(",","").replace(" ","");
        for (int i = 0; i <password.length(); i++)
        {
            if (Character.isDigit(password.charAt(i)))
            {
                Numbers++;
            }
            else if (Character.isAlphabetic(password.charAt(i)))
            {
                Letterscomp++;
            }
            else
            {
                Specials++;
            }
        }
        assertEquals(Chars, Numbers);
        assertEquals(Nums, Specials);
        assertEquals(Letters, Letterscomp);
    }
}