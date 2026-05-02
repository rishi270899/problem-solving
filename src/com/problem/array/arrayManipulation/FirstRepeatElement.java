package com.problem.array.arrayManipulation;

public class FirstRepeatElement {

    static void getRepeatElement(int[] arr) {

        // Problem solve using loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Repeated Number " + arr[i]);
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,1,3};
        getRepeatElement(arr);

    }

}
