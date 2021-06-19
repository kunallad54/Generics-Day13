package com.krunal.max;

import java.util.Scanner;

/**
 * Given 3 Strings find the maximum - Ensure to test code with the Test case
 *
 * @author Krunal Lad
 * @Since 19-06-2021
 */

public class MaxFinder {

    //returns the max value of three strings
    public static String findMax(String a, String b, String c) {
        String max = a;
        if(b.compareTo(max)> 0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        return max;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String str1 = scanner.next();
        System.out.println("Enter the second String : ");
        String str2 = scanner.next();
        System.out.println("Enter the third String : ");
        String str3 = scanner.next();

        String max = findMax(str1,str2,str3);
        System.out.printf("The max of three strings \"%s\" \"%s\" \"%s\" is : \"%s\" \n",str1,str2,str3,max);
    }
}
