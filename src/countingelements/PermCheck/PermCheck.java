package countingelements.PermCheck;
import java.util.*;

public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> contents = new HashSet<>();
        for (Integer item : A) {
            contents.add(item);
        }

        for (int i = 1; i < A.length + 1; i++) {
            if (!contents.contains(i)) {
                return 0;
            }
        }
        return 1;
    }

}
