package com.problem.array.arrayManipulation;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {


    static void getThreeSum(int[] arr, int target) {
        // List<Integer> = output = new  ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        // int[] targetArr = {i, j, k};
                        // System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        // return;
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        System.out.println(temp);

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 5, 3, 5, 8, 1, 6, 7, };
        int target = 12;
        getThreeSum(arr, target);

    }
}




