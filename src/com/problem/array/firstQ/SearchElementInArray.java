package com.problem.array.firstQ;

public class SearchElementInArray {

    static boolean searchElement(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
//                System.out.println("Target found at index: " + i + " " + arr[i]);
            }
        }
        return false;


    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};
        int target = 6;
        boolean ans = searchElement(arr, target);
        System.out.println(ans);
    }
}
