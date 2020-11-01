/*
 * Name: Afnan Mir
 * Date Completed: 8/15/2019
 * Period: 4
 */
/**
 *Creates a list of numbers specifying if prime or not prime
 */
import java.io.*;
import java.util.*;
public class PrimeSieve{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String[] s = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int q  = Integer.parseInt(s[1]);
        PrimeSieves ps = new PrimeSieves(n);
        System.out.println(ps.getNum());
        for(int i = 0;i<q;i++){
            int test = Integer.parseInt(in.readLine());
            if(ps.isPrime(test)){
                out.println(1);
            }else{
                out.println(0);
            }
        }
        out.close();
    }
}
class PrimeSieves {
    private boolean[] nums;
    private int size;
    public static final int DEFAULT_UPPER_BOUND = 100;
    /**
     *creates a list of prime numbers up to a specified upper bound
     *@param upperBound bound to go up to
     */
    public PrimeSieves(int upperBound){
        size = upperBound;
        nums = new boolean[size+1];
        for(int i=2;i<=size;i++){
            nums[i] = true;
        }
        computePrimes();
    }
    /**
     *returns if the specified number is prime or not
     *@param x the number you want to if its prime or not
     *@return whether the number is prime
     */
    public boolean isPrime(int x){
        return nums[x];
    }
    /**
     *returns if the specified number is composite or not
     *@param x the number you want to if its composite or not
     *@return whether the number is composite
     */
    public boolean isComposite(int x){
        return !(isPrime(x));
    }
    
    private void computePrimes(){
        for(int i=2;i<=size;i++){
            if(nums[i]){
                for(int j= i+i; j<=size; j+=i){
                    nums[j] = false;
                }
            }
        }
    }
    public int getNum(){
        int count = 0;
        for(int i = 2;i<nums.length;i++){
            if(nums[i]){
                count++;
            }
        }
        return count;
    }
    /**
     *changes upper bound for the list of prime numbers
     *@param x what the upper bound will be changed to
     */
    public void changeUpperBound(int x){
        nums = new boolean[x+1];
        size = x;
        for(int i =0; i<=x;i++){
            nums[i] = true;
        }	
        computePrimes();	
    }		
    
    
}