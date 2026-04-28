package com.problem.array.arrayManipulation;

public class SortOfArrays0sAnd1s {

    static void sortArr(int[] arr) {
        int len = arr.length;
        int i = 0;
        int j = len - 1;

        while (i < j) {

            // int[] arr = {0,1,0,0,1,1,1,0,0};

            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }

            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
          
        }

        for (int iter : arr) {
            System.out.println(iter);
        }

    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 0, 1, 1, 1, 0, 0};
        sortArr(arr);
    }

}
