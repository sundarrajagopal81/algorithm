package com.questions.onetoten;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static void main(String args[]) {
        int array[] = {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;

        int results[] = twoNumberSum(array, targetSum);
        System.out.println("Result:::" + Arrays.toString(results) );
    }

    // Option-1 Time complexity  and space complexity
    public static int[] twoNumSum(int[] array, int targetNum) {
        for (int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetNum) {
                    return new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }

    // Option:2 Optimal time complexity
    public static int[]twoNumberSum(int[] array, int targetNum){
        //{3,5,-4,8,11,1,-1,6};
        Set nums = new HashSet();

        for ( int num : array){
            int matchNumber = targetNum-num;
           if (nums.contains(matchNumber)) {
                return new int[]{matchNumber,num};
            }
           else{
               nums.add(num);
           }
        }
       return new int[0];
    }
}
