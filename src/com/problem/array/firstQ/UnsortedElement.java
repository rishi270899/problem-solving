package com.problem.array.firstQ;

public class UnsortedElement {

    static int findUnsorted(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i+1] > arr[i]){
    
                // if everything is alright so ahead
            } else {
                return arr[i+1];
            }
        }
        return -1;
    }



    public static void main(String[] args){
        
        int[] arr = {1,2,5,4,9};

        System.out.println(findUnsorted(arr));
        
    }
    
}
