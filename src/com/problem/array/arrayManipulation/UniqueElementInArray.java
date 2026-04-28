package com.problem.array.arrayManipulation;

public class UniqueElementInArray {

    static void getUnique(int[] arr) {

        int xorSum = 0;
        for (int n : arr) {
            xorSum = xorSum ^ n;
        }

        System.out.println(xorSum);

    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 3, 4, 5};
        getUnique(arr);

    }

}
