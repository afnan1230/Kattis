import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class FishMarket {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long m = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long[] fish = new long[n];
        for(int i=0;i<n;i++){
            fish[i] = in.nextLong();
        }
        Arrays.sort(fish);
        long day = 1;
        long streak=0;
        boolean soldToday = true;
        BigInteger profit = BigInteger.valueOf(m);
        int j = 1;
        while(j<n){
            if(fish[j] == day){
                if(streak>0)
                    profit = profit.add(BigInteger.valueOf(m + a*streak +b));
                else
                    profit = profit.add(BigInteger.valueOf(m));
            }else{
                day++;
                streak++;
                profit = profit.add(BigInteger.valueOf(m+a*streak+b));
            }
            j++;
        }
        System.out.println(profit);   
    }
}