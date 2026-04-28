package com.problem.array.arrayManipulation;

public class ShiftArrayByOnePosition {
    
    static int[] shiftOne(int[] arr){

        // step 1: Store last value of array
        int arrLen = arr.length;
        int temp = arr[arrLen - 1];

        // step 2: shift all values of array
        for(int i = arrLen-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
       

       arr[0] = temp;
       return arr;
           
        


        //  while (arrLen == 3) { 
        //     arr[arrLen - 1] = arr[arrLen - 2];
        //     arrLen--;
        // }

    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60,70};

        int[] newArr = shiftOne(arr);

        for(int i : newArr){
            System.out.println(i);
        }
         
    }

}
