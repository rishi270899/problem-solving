package com.problem.array.arrayManipulation;

public class FindPivotIndex {

    static int getPivotElement(int[] arr){

        int len = arr.length;
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];

        leftSum[0] = arr[0];
        

        for(int i = 1; i < len; i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[len-1] = arr[len-1];
      for(int j = len-2; j >= 0; j-- ){
          rightSum[j] = rightSum[j+1] + arr[j];
      }
         
      for(int k = 0; k < len; k++){
        if(leftSum[k] == rightSum[k]){
            return k;
        }
      }
return  -1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(getPivotElement(arr));

    }

}
