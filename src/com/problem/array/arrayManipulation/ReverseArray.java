package com.problem.array.arrayManipulation;

public class ReverseArray {

    static void revArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            // swap using third variable.
            // int temp = 0;
            // temp = arr[i];
            // arr[i] = arr[j];
            // arr[j] = temp;

            // swap using arthemetic operation

            // arr[i] = arr[j] + arr[i];
            // arr[j] = arr[i] - arr[j];
            // arr[i] = arr[i] - arr[j]; 

            // swaping using XOR operator

            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];


            i++;
            j--;
        }

        for(int iter : arr){
            System.out.println(iter);
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 9, 6, 2,15};
        revArray(arr);
       
    }
}
