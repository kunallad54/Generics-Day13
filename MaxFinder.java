package com.krunal.max;

import java.util.Scanner;

/**
 *Extending the max method to take more then three parameters
 *
 * @author Krunal Lad
 * @Since 19-06-2021
 */

public class MaxFinder<T extends Comparable<T>> {

    //declaring instance variables
    Integer[] arrayOfInt;
    Float []  arrayOfFloat;
    String[] arrayOfString;

    public MaxFinder(Integer[] arrayOfInt, Float[] arrayOfFloat, String[] arrayOfString) {
        this.arrayOfInt = arrayOfInt;
        this.arrayOfFloat = arrayOfFloat;
        this.arrayOfString = arrayOfString;
    }
    //parameterized constructor


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking array size from user i.e taking more than three paramters
        System.out.println("Enter the size of all three arrays : ");
        int size = scanner.nextInt();

        Integer[] a = new Integer[size];
        Float[] b = new Float[size];
        String[] c = new String[size];

        // getting user input for integer values
        System.out.println("Enter " + size + " Integer Values : ");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        //getting user input for float values
        System.out.println("Enter " + size + " Float Values : ");
        for (int i = 0; i < size; i++) {
            b[i] = scanner.nextFloat();
        }

        // getting user input for string values
        System.out.println("Enter " + size + " String Values : ");
        for (int i = 0; i < size; i++) {
            c[i] = scanner.next();
        }

        new MaxFinder(a, b, c).testMaximum();


    }

    private void testMaximum() {

        //passing instance variable to static testMaximum method
        Integer maxOfThreeInt = printMax(arrayOfInt);
        System.out.println("The maximum value of three integers is : " + maxOfThreeInt);

        Float maxOfThreeFloat = printMax(arrayOfFloat);
        System.out.println("The maximum value of three floats is : " + maxOfThreeFloat);

        String maxOfThreeString = printMax(arrayOfString);
        System.out.println("The maximum value of three string is : " + maxOfThreeString);
    }

    //displays maximum of three values
   public static Integer printMax(Integer[] inputArray) {

        Integer max = inputArray[0];
        for (Integer t : inputArray) {
            if (t.compareTo(max) > 0)
                max = t;
        }
        return max;
    }
    public static Float printMax(Float[] inputArray) {

        Float max = inputArray[0];
        for (Float t : inputArray) {
            if (t.compareTo(max) > 0)
                max = t;
        }
        return max;
    }
    public static String printMax(String[] inputArray) {

        String max = inputArray[0];
        for (String t : inputArray) {
            if (t.compareTo(max) > 0)
                max = t;
        }
        return max;
    }
}
