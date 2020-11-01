import java.io.*;
import java.util.*;
public class AlmostPerfect {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println(Integer.MAX_VALUE>Math.pow(10,9));
        System.out.println(Math.pow(10,9));
        while(in.hasNextInt()){
            int test = in.nextInt();
            int diff = isPerfect(test);
            if(diff==0){
                System.out.println(test+ " perfect");
            }else if(diff<=2){
                System.out.println(test+" almost perfect");
            }else{
                System.out.println(test+" not perfect");
            }
        }

    }
    public static int isPerfect(int n){
        Set<Integer> factors = new HashSet<Integer>();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                factors.add(i);
                factors.add(n/i);
            }
        }
        int sum = 0;
        for(int x: factors){
            if(x!=n)
                sum+=x;
        }
        return Math.abs(sum-n);

    }
}