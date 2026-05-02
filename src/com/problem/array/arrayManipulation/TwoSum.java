package com.problem.array.arrayManipulation;

public class TwoSum {

    static void getTarget(int[] arr) {
        // int len = arr.length;
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    return;
                } 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 4, 6 };
        getTarget(arr);
    }
}
