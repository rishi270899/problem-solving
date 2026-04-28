package com.problem.array.firstQ;

public class CountZeroOnes {

    static void countZeroOne(int[] arr){

        int zero = 0;
        int one = 0;

        for(int i= 0; i < arr.length; i++){
            if(arr[i] == 1) {
                one++ ;
            }
            if(arr[i] == 0){
                zero++;
            }
        }

        // int[] ans = {zero, one};
        // return ans;


        System.out.println(zero);
        System.out.println(one);
    }



    public static void main(String[] args){
        int[] arr = {1,0,1,1,1,0,0,0,0};

        countZeroOne(arr);

    }
    
}
