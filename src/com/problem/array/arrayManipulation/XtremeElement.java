package com.problem.array.arrayManipulation;

public class XtremeElement {

    static void printExtremeElement(int[] arr){

       int len = arr.length;
       int i = 0;
       int j = len-1;
       while(i <= j){
        if( i == j){
            System.out.println(arr[i]);
            return;
        }
        System.out.println(arr[i]);
        System.out.println(arr[j]);
        i++;
        j--;
       } 
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printExtremeElement(arr);
    }
}
