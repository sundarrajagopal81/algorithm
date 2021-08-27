package com.questions.onetoten;

import java.util.HashSet;
import java.util.Set;

class BstProgramProgram {
    public static void main(String args[]){
        int array[] =  {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        System.out.println("Output :-"+twoNumberSum(array,targetSum));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // array = [3,5,-4,8,11,1,-1,6]
        //targetSum = 10;
        Set<Integer> numbers = new HashSet();
        for(int value : array){
            int match = targetSum - value;
            if(numbers.contains(match)){
                return new int[] {match,value};
            }
            else{
                numbers.add(value);
            }
        }
        return new int[0];
    }

}

