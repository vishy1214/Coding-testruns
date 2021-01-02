package timecomplexity.frogjump;

public class FrogJump {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int hops = 0;
        if(X >= Y){
            return hops;
        }else if((X+D) >= Y){
            return 1; //1 hops
        }

        int targetDistance = (Y-X);
        int divisible = Math.floorDiv(targetDistance,D);
        int coveredDistance = (divisible * D) + X;
        int balance = Y - coveredDistance;

        if( balance == 0){
            hops = divisible;
        }else if(balance >0 && balance <= D){
            hops = divisible + 1;
        }else{
            //greater than D. that's not really possible.
        }
        return hops;
    }

    /***  sample TEST cases ***/
    public static void main(String args[]){
        FrogJump frogJump = new FrogJump();
        System.out.println("Number of hops: "+frogJump.solution(10,85,30));
        System.out.println("Number of hops: "+frogJump.solution(100,250,30));
        System.out.println("Number of hops: "+frogJump.solution(100,260,30));
    }
}
