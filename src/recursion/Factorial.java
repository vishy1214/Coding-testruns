package recursion;

public class Factorial {
    private int findFactorialOf(int n){
        if(n == 0){
            return 1;
        }else{
            return n * findFactorialOf(n-1);
        }
    }

    public static void main(String[] args){
        Factorial factorial = new Factorial();
        System.out.println(factorial.findFactorialOf(5));
    }
}
