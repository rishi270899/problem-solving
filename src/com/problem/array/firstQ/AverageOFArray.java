package com.problem.array.firstQ;

public class AverageOFArray {

   static double getAverage(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        int size = arr.length;
        int avg = sum/size;
        return avg;
    }


    public static void main(String[] args) {
       int[] arr = {1,52,4,5,6};

        System.out.println(getAverage(arr));
}}
