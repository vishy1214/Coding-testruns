package sorting.MaxProductOfThree;
import java.util.*;

/**
 * sample test case: [-5, 5, -5, 4] ==> output: 125
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int length = A.length;

        if (length < 3) {
            return 0;
        }
        Arrays.sort(A);  //nlogn

        int productOfLast3 = A[length - 1] * A[length - 2] * A[length - 3];
        int firstTwoAndLast = A[0] * A[1] * A[length - 1];
        int firstAndLastTwo = A[0] * A[length - 1] * A[length - 2];
        int firstThree = A[0] * A[1] * A[2];

        // System.out.println(productOfLast3);
        //  System.out.println(firstTwoAndLast);
        //  System.out.println(firstAndLastTwo);
        //  System.out.println(firstThree);
        int firstMax = Math.max(productOfLast3, firstTwoAndLast);
        int secondMax = Math.max(firstAndLastTwo, firstThree);

        return Math.max(firstMax, secondMax);
    }
}
