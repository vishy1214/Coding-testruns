package arrays.cyclingrotation;
import java.util.*;


public class CyclicRotation {

    public int[] solution(int[] A, int K){
        //write your code here
        /*
          todo:
             questions:
             1. is it ok to collect the rotated items in a new array or should it be same array ?
             2. Can I achieve this in n complexity ?
             3. what is the logic to determine the next index.

             approach:
              - using a new empty array to capture the rotated elements "rotated"
              - rotating with just one for loop

             1. For every i iteration, increment the nextIdx by i + k
             2. set the "rotated" array with the A[i] at nextIdx.

             General Test cases:
             1. K == 0  -- return A
             2. K < A.length
                - nextIdx = i + k (should work)
             3. K >= A.length or nextIdx > A.length
                nextIdx = nextIdx - A.length ( perform this recursive)
                or Does % work here ? ie. nextIdx = nextIdx % A.length

             4. K == -1 or less  (K is expected to be 0 to 100)
         */

        int[] rotated = new int[A.length];

        for(int i=0; i < A.length; i++){
            int nextIdx = i + K;
            if(nextIdx >=  A.length){
                nextIdx = nextIdx % A.length;
            }

            rotated[nextIdx] = A[i];
        }

        return rotated;
    }

    //recursively find the nextIndex..... (% seems to solve our requirement well enough, hence not required)
    private int getNextIndex(int potentialNext, int K, int length){
        int nextIdx = potentialNext;
        if(nextIdx > length){
            nextIdx = nextIdx - length;
            return getNextIndex(nextIdx,K,length);
        }
        return nextIdx;
    }



    /***  TEST cases ***/
    public static void main(String args[]){
        CyclicRotation cyclicRotation = new CyclicRotation();
        System.out.println("input array => {3,8,9,7,6}. following are the rotated ones.");
        printMe(cyclicRotation.solution(new int[] {3,8,9,7,6},7));
        printMe(cyclicRotation.solution(new int[] {3,8,9,7,6},10));
        printMe(cyclicRotation.solution(new int[] {3,8,9,7,6},12));
        printMe(cyclicRotation.solution(new int[] {3,8,9,7,6},25));
        printMe(cyclicRotation.solution(new int[] {3,8,9,7,6},99));
    }

    private static void printMe(int[] array){
        for(int a: array){
            System.out.print(a);
        }
        System.out.println(" ");
    }
}

