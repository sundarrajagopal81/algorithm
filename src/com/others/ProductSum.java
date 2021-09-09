package com.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static void main(String[] args) {
        List<Object> inputList =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        // [5,2,[7,-1],3,[6,[-13,8],4]]
        System.out.println("OUTPUT :"+productSumHelper(inputList,1));
    }

    public static int productSum(List<Object> array){

        return productSumHelper(array,1);
    }

    public static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object e1 : array){
            if (e1 instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                ArrayList<Object> ls = (ArrayList<Object>) e1;
                sum += productSumHelper(ls, multiplier + 1);
            } else {
                sum += (int) e1;
            }
        }
        return sum * multiplier;
    }
}
