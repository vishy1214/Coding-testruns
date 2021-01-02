package arrays.findoddnumber;

public class FindNumberThatDontMatch {
    public int solution(int[] A) {
        // write your code in Java SE 8
        /*
        thoughts & questions:
        1. Length of the array could be anywhere between 1 to 1m, so efficiency is KEY. Can we do this in O(n) time complexity ?

        possible approach:
        1. have two for loops - not efficient. O(N * N) time complexity.
        2. have a while with left & right index variables which gets incremented in a controlled manner. (Preffered) O(n) time complexity.

        finalized approach:
        1. while loop  with left & right index variable.
        2. for every increment of left index, the right index starts from length of the array and moves left until its index >= left index.
        3. loop thru as long as array[leftindex] == array[rightIndex]
        4. break out as soon as ther's a
        */

        int leftIdx = 0;
        int rightIdx = leftIdx +1;
        Set<Integer> previousMatches = new HashSet<>();
        //Set<Integer> noMatchSoFar = new HashSet<>();
        while(leftIdx < A.length-1 && rightIdx < A.length){

            System.out.format("previousMatches.contains: %s -- currRightIdx: %d(currLeftIdx: %d)  &&  %d == %d .%n",(previousMatches.toString()),rightIdx,leftIdx,A[leftIdx], A[rightIdx]);

            if(!previousMatches.contains(rightIdx) && A[leftIdx] == A[rightIdx]){
                System.out.format("added index: %d (value: %d) .%n",rightIdx,A[rightIdx]);
                previousMatches.add(rightIdx);
                leftIdx += 1;
                rightIdx = leftIdx + 1;
                continue;
            }else{
                // System.out.println(" dont match");
            }

            if(rightIdx == A.length-1){
                leftIdx += 1;
                rightIdx = leftIdx + 1 ; //re-initializing the rightIdx
            }else{
                rightIdx++; //default rightIdx keeps moving left.
            }

        }
        //System.out.println(noMatchSoFar.toString());
        return 0;
    }

}
