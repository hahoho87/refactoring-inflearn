package com.hahoho87.refactoring._06_mutable_data._23_change_reference_to_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TelephoneNumberTest {

    @Test
    void equalityTest() {
        TelephoneNumber number1 = new TelephoneNumber("123", "4567");
        TelephoneNumber number2 = new TelephoneNumber("123", "4567");
        assertEquals(number1, number2);
    }

}