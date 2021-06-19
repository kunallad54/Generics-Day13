package com.krunal.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        Integer a = 10, b = 25, c = 50;
        Integer max = MaxFinder.findMax(a, b, c);
        Assertions.assertEquals(50,max,"Validating Max Method");
    }


}
