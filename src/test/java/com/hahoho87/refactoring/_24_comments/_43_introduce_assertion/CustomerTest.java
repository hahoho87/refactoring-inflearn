package com.hahoho87.refactoring._24_comments._43_introduce_assertion;

import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void assertTest() {
        Customer customer = new Customer();
        customer.setDiscountRate(-1.0);
    }

}