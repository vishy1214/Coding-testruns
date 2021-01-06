package recursion;


/**
 * binary search is a Good approach to search a SORTED array.
 */
public class BinarySearch {

    private static boolean search(int[] A,int element){
       return recursiveSearch(A,element,0,A.length-1);
    }

    private static boolean recursiveSearch(int[] A, int element, int low, int high){
        if(low > high){
            return false;
        }
        int mid = (low + high) / 2;
        if(element == A[mid]){
                return true;
        }else if(element < A[mid]){
            return recursiveSearch(A,element,low,mid-1);
        }else{
            //(element > A[mid])
            return recursiveSearch(A,element,mid+1,high);
        }
    }

    public static void main(String[] args){
        int[] A = new int[]{1,4,6,8,10,11,12, 14, 16,18};

        System.out.println("Is available ? "+search(A,14));
        System.out.println("Is available ? "+search(A,15));
        System.out.println("Is available ? "+search(A,28));
        System.out.println("Is available ? "+search(A,0));
        System.out.println("Is available ? "+search(A,1));
    }
}
