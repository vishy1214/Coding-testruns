package prefix_sum.CountDiv;

public class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        /*
        The simplest approach is to iterate through the whole array for each result separately;
        however, that requires O(n·m) time. The better approach is to use prefix sums. If we calculate
        the prefix sums then we can answer each question directly in constant time
        */

        return ((int)(Math.floor(B/K) - Math.floor(A/K) )) + (A%K == 0 ? 1 : 0);
    }
}
