package org.example.ex36;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        App undertest = new App();
        double result;
        List<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(100);
        Numbers.add(200);
        Numbers.add(1000);
        Numbers.add(300);
        result = undertest.average(Numbers);
        assertEquals(400.0, result);
    }

    @Test
    void max() {
        App undertest = new App();
        int result;
        List<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(100);
        Numbers.add(200);
        Numbers.add(1000);
        Numbers.add(300);
        result = undertest.max(Numbers);
        assertEquals(1000, result);
    }

    @Test
    void min() {
        App undertest = new App();
        double result;
        List<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(100);
        Numbers.add(200);
        Numbers.add(1000);
        Numbers.add(300);
        result = undertest.min(Numbers);
        assertEquals(100, result);
    }

    @Test
    void std() {
        App undertest = new App();
        double result;
        List<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(100);
        Numbers.add(200);
        Numbers.add(1000);
        Numbers.add(300);
        result = undertest.std(Numbers);
        assertEquals(353.5533905932738, result);
    }
}