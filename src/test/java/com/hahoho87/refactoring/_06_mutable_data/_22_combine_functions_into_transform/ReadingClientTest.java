package com.hahoho87.refactoring._06_mutable_data._22_combine_functions_into_transform;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.Year;

class ReadingClientTest {

    @Test
    void client1() {
        Client1 client1 = new Client1(acquireReading());
        Assertions.assertEquals(100d, client1.baseCharge);
    }

    @Test
    void client2() {
        Client2 client2 = new Client2(acquireReading());
        Assertions.assertEquals(100d, client2.getBase());
        Assertions.assertEquals(95d, client2.getTaxableCharge());
    }

    @Test
    void client3() {
        Client3 client3 = new Client3(acquireReading());
        Assertions.assertEquals(100d, client3.getBasicChargeAmount());
    }


    private Reading acquireReading() {
        return new Reading("hahoho", 10, Month.DECEMBER, Year.of(2022));
    }

}