package org.example.ex27;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void firstNameValidate() {
        App undertest = new App();
        String input;
        String result;
        input = "John";
        result = undertest.FirstNameValidate(input);
        assertEquals("", result);

        input = "J";
        result = undertest.FirstNameValidate(input);
        assertEquals("The first name must be at least 2 characters long.\n", result);

        input = "";
        result = undertest.FirstNameValidate(input);
        assertEquals("The first name must be filled in.\n", result);
    }

    @Test
    void lastNameValidate() {
        App undertest = new App();
        String input;
        String result;
        input = "Johnson";
        result = undertest.LastNameValidate(input);
        assertEquals("", result);

        input = "J";
        result = undertest.LastNameValidate(input);
        assertEquals("The last name must be at least 2 characters long.\n", result);

        input = "";
        result = undertest.LastNameValidate(input);
        assertEquals("The last name must be filled in.\n", result);
    }

    @Test
    void emp_IDValidate() {
        App undertest = new App();
        String input;
        String result;
        input = "TK-4321";
        result = undertest.Emp_IDValidate(input);
        assertEquals("", result);

        input = "Ak-4324313434";
        result = undertest.Emp_IDValidate(input);
        assertEquals("The Employee ID must be in the format of AA-1234\n", result);

        input = "Tka3434";
        result = undertest.Emp_IDValidate(input);
        assertEquals("The Employee ID must be in the format of AA-1234\n", result);

        input = "AK-asa1";
        result = undertest.Emp_IDValidate(input);
        assertEquals("The Employee ID must be in the format of AA-1234\n", result);
    }

    @Test
    void ZIPValidate() {
        App undertest = new App();
        String input;
        String result;
        input = "55555";
        result = undertest.ZIPValidate(input);
        assertEquals("", result);

        input = "555555";
        result = undertest.ZIPValidate(input);
        assertEquals("The zipcode must be a five digit number\n", result);

        input = "abcde";
        result = undertest.ZIPValidate(input);
        assertEquals("The zipcode must be a five digit number\n", result);
    }
}