package arrays.OddOccurrencesInArray;

import java.util.*;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        /*
        thoughts & questions:
        1. Length of the array could be anywhere between 1 to 1m, so efficiency is KEY. Can we do this in O(n) time complexity ?

        possible approach:
        1. have two for loops - not efficient. O(N * N) time complexity.
        2. have a while with left & right index variables which gets incremented in a controlled manner.
            pros:O(n) time complexity.

            cons: you still need some data structure to keep a track of the match.
                  this approach worked but it wasn't fast enough for 500k+ array elements.


        3. hashmap<array_value, occurrence_count>
               1. Make an entry in the hashmap for every element in the array.
               2. if there's a match increment the occurrence_count(ie. the hashmap value) by 1.
             => as per the the assumption, hashmap will contain only 1 item with occurrence_count as 1. (mod function comes in handy)
        */

        int noMatch = -1;
        HashMap<Integer, Integer> occurence = new HashMap<>();

        for(int idx =0 ; idx < A.length; idx++){
            int idxVal = A[idx];
            if(occurence.containsKey(idxVal)){
                occurence.put(idxVal,occurence.get(idxVal)+1);
            }else{
                occurence.put(idxVal,1);
            }
        }

        for(Map.Entry<Integer,Integer> kv : occurence.entrySet()){
            if(kv.getValue()%2 !=0){
                noMatch = kv.getKey();
                break;
            }
        }
        return noMatch;
    }

    /***  sample TEST cases ***/
    public static void main(String args[]){
        OddOccurrencesInArray cyclicRotation = new OddOccurrencesInArray();
        System.out.println("OddElement in the array: "+cyclicRotation.solution(new int[] {9,3,9,3,9,7,9}));
        System.out.println("OddElement in the array: "+cyclicRotation.solution(new int[] {9,3,9,3,9,7,9,0,0}));
        System.out.println("OddElement in the array: "+cyclicRotation.solution(new int[] {9,3,9,3,9,7,7,9,0,0,0}));
        System.out.println("OddElement in the array: "+cyclicRotation.solution(new int[] {10}));
        System.out.println("OddElement in the array: "+cyclicRotation.solution(new int[] {9,3,9,3,9,7,7,9,0,0,1,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0,9,3,9,3,9,7,7,9,0,0}));
    }

}
