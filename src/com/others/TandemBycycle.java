package com.others;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TandemBycycle {

    public static void main(String args[]){
        int[] redShirtSpeeds = new int[] {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = new int[] {3, 6, 7, 2, 1};
        boolean fastest = true;
        System.out.println("OUTPUT:"+ tandemBycyle(redShirtSpeeds,blueShirtSpeeds,true));
    }
    public static int tandemBycyle(int[] redShirtSpeeds,int[] blueShirtSpeeds,boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        if (!fastest) {
            reverseTheArrayInPlace(redShirtSpeeds);
        }
        int totalSpeed =0;
        for(int index =0; index < redShirtSpeeds.length;index++) {
            int rider1 = redShirtSpeeds[index];
            int rider2 = blueShirtSpeeds[blueShirtSpeeds.length- index - 1];
            totalSpeed+=Math.max(rider1,rider2);

        }
        return totalSpeed;
    }

    public static void reverseTheArrayInPlace(int[] shirtSpeedArray){
       Arrays.stream(shirtSpeedArray)
                .boxed()
                .sorted(Comparator.reverseOrder()) // just use 'sorted()' for ascending order
                .mapToInt(Integer::intValue)
                .toArray();
    }

//    public static void reverseTheArrayInPlace(int[] arr){
//
//        int start =0;
//        int end = arr.length - 1;
//
//        while (start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start+=1;
//            end-=1;
//        }
//
//    }


}
