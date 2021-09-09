package com.others;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {
        //0,1,1,2,3
        System.out.println("Fibonacci output:::> " + getNthFib(5));
    }

    // Solution-1 //O (2 ^ n) time| O(n) Space
//    public static int fib(int n) {
//        if (n == 2) {
//            return 1;
//        } else if (n == 1) {
//            return 0;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }

    // Solution -2



    // Solution-1 //O (n) time| O(n) Space
//    public static int getNthFib(int n) {
//        Map<Integer, Integer> memoize = new HashMap<Integer, Integer>();
//        memoize.put(1, 0);
//        memoize.put(2, 1);
//        return getNthFib(n, memoize);
//    }

    public static int getNthFib(int n, Map<Integer, Integer> memoize) {
        if (memoize.containsKey(n)) {
            return memoize.get(n);
        } else {
            memoize.put(n, getNthFib(n - 1, memoize) + getNthFib(n - 2, memoize));
            return memoize.get(n);
        }
    }

    // Solution -3
    public static int getNthFib(int n){
        int[] lastTwo = {0,1};
        int count = 3;
        while(count <=n ){
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0]=lastTwo[1];
            lastTwo[1]=nextFib;
            count++;
        }
        return n > 1 ? lastTwo[1]:lastTwo[0];

    }
}


