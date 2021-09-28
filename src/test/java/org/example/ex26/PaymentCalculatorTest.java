package org.example.ex26;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator undertest = new PaymentCalculator();
        int input1 = 5000, input2 = 100;
        double input3 = 12;
        int result;

        result = undertest.calculateMonthsUntilPaidOff(input1, input3, input2);
        assertEquals(70, result);
    }
}