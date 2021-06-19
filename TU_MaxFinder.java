package com.krunal.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class TU_MaxFinder {
    @Test
    void whenIntegerShouldReturnMax() {
        String str1 = "apple",str2 = "banana",str3 ="abstract";
        String max = MaxFinder.findMax(str1,str2,str3);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals("banana",max,"Validating Max Method");
    }


}
