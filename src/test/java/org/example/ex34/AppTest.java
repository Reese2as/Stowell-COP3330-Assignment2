package org.example.ex34;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void printlist() {
        App undertest = new App();

        String result;
        List<String> Employees = new ArrayList<String>();

        Employees.add("John Smith");
        Employees.add("Jackie Jackson");
        Employees.add("Chris Jones");
        Employees.add("Amanda Cullen");
        Employees.add("Jeremy Goodwin");
        result = undertest.printlist(Employees);
        assertEquals("John Smith\nJackie Jackson\nChris Jones\nAmanda Cullen\nJeremy Goodwin\n", result);

    }
}