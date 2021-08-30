package com.others;

import java.util.Arrays;

// Minimum waiting time
public class MinimumWaitingTime {

    public static void main(String args[]){
        int[] queries = new int[] {3, 2, 1, 2, 6};
        int expected = 17;
        var actual = minimumWaitingTime(queries);
        System.out.println("MinimumWait time::"+actual);
    }

    public static int minimumWaitingTime(int[] queries){
        Arrays.sort(queries);
        int totalWaitingTime = 0;
        for(int index=0; index < queries.length; index++){
            int duration = queries[index];
            int queriesLeft = queries.length-(index+1);
            totalWaitingTime+=duration * queriesLeft;
        }
        return totalWaitingTime;
    }
}
