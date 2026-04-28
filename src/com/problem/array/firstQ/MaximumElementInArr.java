package com.problem.array.firstQ;

public class MaximumElementInArr {

    static int findMax(int[] arr){
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > min){
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
         int[] arr = {1,3,5,40,117};
         System.out.println(findMax(arr));
    }
}
