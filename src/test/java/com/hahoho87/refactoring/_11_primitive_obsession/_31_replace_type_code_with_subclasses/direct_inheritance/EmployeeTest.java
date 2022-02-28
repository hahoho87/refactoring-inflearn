package com.hahoho87.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeTest {

    @Test
    void employeeType() {
        assertEquals("engineer", new Engineer("keesun").getType());
        assertEquals("manager", new Manager("keesun").getType());
        assertThrows(IllegalArgumentException.class, () -> Employee.createEmployees("keesun", "wrong type"));
    }

}