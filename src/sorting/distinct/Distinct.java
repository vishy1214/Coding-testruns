package sorting.distinct;
import java.util.*;

public class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> distincts = new HashSet<>();

        for(int i=0;i < A.length ; i++){
            distincts.add(A[i]);
        }

        return distincts.size();

    }
}
