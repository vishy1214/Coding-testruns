package primeAndCompositeNumbers.MinPerimeterRectangle;

public class MinPerimeterRectangle {
    public static int solution(int N) {
        // write your code in Java SE 8

        int minPerimeter = Integer.MAX_VALUE;
        int nextFactor = 0;
        int perimeter = 0;
        int i =1;
        while(i * i <= N){
            if(N % i == 0){
                nextFactor = N / i;
                perimeter =  2 * (i + nextFactor);
                //System.out.format("%d mod %d ... nextFact: %d %n",N,i,nextFactor,perimeter);
                // System.out.format("perimeter: %d , minPerimeter: %d %n",perimeter,minPerimeter);
                minPerimeter = Math.min(perimeter,minPerimeter);
            }
            i +=1;
        }
        return minPerimeter;
    }

    public static void  main(String[] args){
        System.out.println(solution(1));
        System.out.println(solution(30));
        System.out.println(solution(36));
        System.out.println(solution(42));
        System.out.println(solution(1000000000));
    }
}
