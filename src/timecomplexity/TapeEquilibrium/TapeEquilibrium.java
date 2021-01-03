package timecomplexity.TapeEquilibrium;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int allSum = 0;
        int leftArraySum = 0;
        int rightArraySum = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            allSum += A[i];
        }

        for (int i = 0; i < A.length - 1; i++) {
            leftArraySum += A[i];
            rightArraySum = allSum - leftArraySum;
            int currentDiff = Math.abs(rightArraySum - leftArraySum);
            minDiff = Math.min(currentDiff, minDiff);
        }

        return minDiff;
    }
}


/*
scratch pad
 */