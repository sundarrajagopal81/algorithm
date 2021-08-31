package com.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassPhotos {

    public static void main(String args[]){
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));
        System.out.println("Photos class match :"+classPhotos(redShirtHeights, blueShirtHeights));
    }

    public static boolean classPhotos(ArrayList<Integer>  redShirtHeights, ArrayList<Integer> blueShirtHeights){
        Collections.sort(redShirtHeights,Collections.reverseOrder()); // 8,5,4,3,1
        Collections.sort(blueShirtHeights,Collections.reverseOrder()); // 9,6,5,4,2
        String shirtColorInFirstRow = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "RED" : "BLUE";

        for(int index =0; index < redShirtHeights.size();index++){
            int redShirtHeight = redShirtHeights.get(index);
            int blueShirtHeight = blueShirtHeights.get(index);

            if (shirtColorInFirstRow == "RED") {
                if(redShirtHeight >= blueShirtHeight){
                    return false;
                }
            } else{
                if(blueShirtHeight >= redShirtHeight){
                    return false;
                }

            }

        }

        return  true;
    }
}




