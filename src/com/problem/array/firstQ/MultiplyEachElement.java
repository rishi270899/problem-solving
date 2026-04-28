package com.problem.array.firstQ;

public class MultiplyEachElement {

    static int[] multiply(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];

        for(int i = 0; i < size; i++){
            newArr[i] = arr[i]*10;
        }

        return newArr;

//         for(int i : arr){
//
//         }
    }


    public static void main(String[] args){

        int[] arr = {1,52,4,5,6};
        int[] multiArr = multiply(arr);

        for (int i : multiArr){
            System.out.println(i);
        }

    }

}
