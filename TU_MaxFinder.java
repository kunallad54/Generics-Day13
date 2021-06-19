package com.krunal.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Float a = 30.5f,b = 20.5f, c = 30.6f;
        Float max = MaxFinder.findMax(a, b, c);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals(30.6f,max,"Validating Max Method");
    }


}
