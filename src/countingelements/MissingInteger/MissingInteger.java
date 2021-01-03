package countingelements.MissingInteger;
import java.util.*;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> contents = new HashSet<>();
        int returnVal = 1;
        for(Integer item: A){
            contents.add(item);
        }

        for(int i=1; i <= A.length+1; i++){
            //  System.out.println(i);
            if(!contents.contains(i)){
                return i;
            }
        }
        return returnVal;
    }
}
