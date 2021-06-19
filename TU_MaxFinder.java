package com.krunal.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class TU_MaxFinder {

    // test case 1 : max value at 1st position
    @Test
    void whenStringShouldReturnMax1() {
        String str1 = "banana",str2 = "apple",str3 ="abstract";
        String max = MaxFinder.findMax(str1,str2,str3);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals("banana",max,"Validating Max Method in Test Case 1");
    }

    // test case 2 : max value at 2nd position
    @Test
    void whenStringShouldReturnMax2() {
        String str1 = "apple",str2 = "banana",str3 ="abstract";
        String max = MaxFinder.findMax(str1,str2,str3);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals("banana",max,"Validating Max Method method in Test case 2");
    }

    // test case 3 : max value at 3rd position
    @Test
    void whenStringShouldReturnMax3() {
        String str1 = "apple",str2 = "abstract",str3 ="banana";
        String max = MaxFinder.findMax(str1,str2,str3);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals("banana",max,"Validating Max Method in Test Case 3");
    }
}
