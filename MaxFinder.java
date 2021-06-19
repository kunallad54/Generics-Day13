package com.krunal.max;

public class MaxFinder {

    public static Integer findMax(Integer a, Integer b, Integer c) {
        Integer max = a;
        if(b.compareTo(max)> 0)
            max = b;
        if(c.compareTo(max)>0)
            max = c;
        System.out.printf("The max of three numbers %s %s %s is : %s \n",a,b,c,max);
        return max;
    }
    public static void main(String[] args) {
        Integer int1 = 37,int2 = 45,int3 = 56;
        Integer max = findMax(int1,int2,int3);
    }
}
