package com.krunal.max;

import javax.swing.text.DefaultEditorKit;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Refactoring all the 3 to One Generic Method and find the maximum
 *
 * @author Krunal Lad
 * @Since 19-06-2021
 */

public class MaxFinder {

    //creating generic method and  this method extends comparable and returns max value
    public static <T extends Comparable<T>> T findMax (T[] inputArray){
        T max = inputArray[0];
        for(T t : inputArray){
            if(t.compareTo(max)>0)
                max = t;
        }
        return max;
    }
    public static void main(String[] args) {

        Integer[] arrayOfInteger = {33,22,43};
        Float[] arrayOfFloats = {22.34f,34.43f,34.44f};
        String[] arrayOfStrings = {"apple","banana","cat"};

        Integer maxOfThreeInteger = findMax(arrayOfInteger);
        System.out.println("The maximum value of three integers is : "+maxOfThreeInteger);

        Float  maxOfThreeFloats = findMax(arrayOfFloats);
        System.out.println("The maximum value of three floats is : "+maxOfThreeFloats);

        String maxOfThreeStrings = findMax(arrayOfStrings);
        System.out.println("The maximum value of three strings is : "+maxOfThreeStrings);

    }
}
