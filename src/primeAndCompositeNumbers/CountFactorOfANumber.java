package primeAndCompositeNumbers;

public class CountFactorOfANumber {
    public static int solution(int N) {
        // write your code in Java SE 8
        int i =1;
        int counter = 0;

        while(i* i < N){
            if(N % i == 0){
                counter += 2;
            }
            i +=1;
        }

        if( i *i == N){
            counter +=1;
        }

        return counter;
    }

    public static void main (String[] args){
        System.out.println(solution(2000000000));
    }
}
