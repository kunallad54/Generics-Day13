package com.krunal.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class TU_MaxFinder {

    // Test Case 1 : For Integer Values-max value at 1st position
    @Test
    void whenIntegerShouldReturnMax1() {
        Integer[] arrayOfInteger = {43,33,22};
        Integer max = MaxFinder.findMax(arrayOfInteger);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals(43,max,"Validating Max Method in Test Case 1 for Integer Numbers");
    }

    // Test Case 2 : For Integer Values-max value at 2nd position
    @Test
    void whenIntegerShouldReturnMax2() {
        Integer[] arrayOfInteger = {33,43,22};
        Integer max = MaxFinder.findMax(arrayOfInteger);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals(43,max,"Validating Max Method in Test Case 2 for Integer Numbers");
    }

    // Test Case 3 : For Integer Values-max value at 3rd position
    @Test
    void whenIntegerShouldReturnMax3() {
        Integer[] arrayOfInteger = {33,22,43};
        Integer max = MaxFinder.findMax(arrayOfInteger);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals(43,max,"Validating Max Method in Test Case 3 for Integer Numbers");
    }

    // Test Case 1 : For Float Values-max value at 3rd position
    @Test
    void whenFloatShouldReturnMax1() {
        Float[] arrayOfFloats = {34.44f, 22.34f, 34.43f};
        Float max = MaxFinder.findMax(arrayOfFloats);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals(34.44f,max,"Validating Max Method in Test Case 1 for Float Numbers");
    }

    // Test Case 2 : For Float Values-max value at 3rd position
    @Test
    void whenFloatShouldReturnMax2() {
        Float[] arrayOfFloats = {22.34f,34.44f,34.43f};
        Float max = MaxFinder.findMax(arrayOfFloats);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals(34.44f,max,"Validating Max Method in Test Case 2 for Float Numbers");
    }

    // Test Case 3 : For Float Values-max value at 3rd position
    @Test
    void whenFloatShouldReturnMax3() {
        Float[] arrayOfFloats = {22.34f,34.43f,34.44f};
        Float max = MaxFinder.findMax(arrayOfFloats);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals(34.44f,max,"Validating Max Method in Test Case 3 for Float Numbers");
    }

    // Test case 1 :  For String Values - max value at 1st position
    @Test
    void whenStringShouldReturnMax1() {
        String[] arrayOfString = {"cat","apple","banana"};
        String max = MaxFinder.findMax(arrayOfString);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals("cat",max,"Validating Max Method in Test Case 1");
    }

    // Test case 2 : For String Values - max value at 2nd position
    @Test
    void whenStringShouldReturnMax2() {
        String[] arrayOfString = {"apple","cat","banana"};
        String max = MaxFinder.findMax(arrayOfString);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals("cat",max,"Validating Max Method in Test Case 1");
    }

    // Test case 3 : For String Values - max value at 3rd position
    @Test
    void whenStringShouldReturnMax3() {
        String[] arrayOfString = {"apple","banana","cat"};
        String max = MaxFinder.findMax(arrayOfString);

        // Checking whether test code is passing test case or not
        Assertions.assertEquals("cat",max,"Validating Max Method in Test Case 1");
    }
}

