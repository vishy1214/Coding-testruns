package leader.dominator;
import java.util.*;

public class Dominator {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A.length <= 2) return -1;

        Map<Integer,Integer> dominators = new HashMap<>();
        Arrays.sort(A);

        for(int i=0;i<A.length;i++){
            int ival=A[i];
            if(dominators.containsKey(ival)){
                dominators.put(ival,dominators.get(ival)+1);
            }else{
                dominators.put(ival,1);
            }
        }

        int candidateCount = -1;
        int candidate = -1;
        for(Map.Entry<Integer,Integer> entry: dominators.entrySet()){
            if( candidateCount < entry.getValue()){
                candidateCount = entry.getValue();
                candidate = entry.getKey();
            }
        }
        // System.out.println(A.length/2);
        // System.out.println(A[A.length/2]);
        //System.out.println(candidateCount);
        if(candidate == A[A.length/2] && candidateCount > (A.length/2)){
            return (A.length/2);
        }

        return -1;
    }
}
