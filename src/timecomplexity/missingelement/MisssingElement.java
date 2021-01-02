package timecomplexity.missingelement;


public class MisssingElement {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int len = A.length;
        if(len == 0) return 1;

        int sumA = 0;
        for(int i=0; i < len; i++){
            sumA += A[i];
        }


        int sumI = 0;
        for(int i=1;i <= len +1 ; i++){
            sumI += i;
        }

        return  sumI - sumA;
    }
}





/*
  a = [1,3]
      length = 2
      sum(a) = a[0] + a[1] = 1 + 3 = 4
      sumI => for(i = 1 to length+1){ sumI =+ i} ==> 1 + 2 + 3 = 6
      (N*(N+1))/2 => 2(2+1)/2 = 3

      return sumI - sum(a) (ie. 6 - 4 => 2)
 */