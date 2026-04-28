package com.problem.array.firstQ;

public class SumOfPositiveandNegativeNum {

    static void sumOfPositiveandNegative(int[] arr) {

        int sumofPositive = 0;
        int sumofNegative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumofPositive = sumofPositive + arr[i];
            }

            if (arr[i] < 0) {
                sumofNegative = (sumofNegative) + (arr[i]);
            }
        }

        System.out.println("sum of positive number: " + sumofPositive);
        System.out.println("sum of negative number: " + sumofNegative);

    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 4, -5, -2, 6, -8, 10};

        sumOfPositiveandNegative(arr);

    }

}
