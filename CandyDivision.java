import java.io.*;
import java.util.*;
import java.math.*;
public class CandyDivision {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        BigInteger n = new BigInteger(in.readLine());
        int limit = (n.sqrt().intValue())+1;
        Set<BigInteger> s = new TreeSet<BigInteger>();
        for(int i =0;i< limit;i++){
            if(n.mod(new BigInteger((i+1)+"")).intValue()==0){
                s.add(new BigInteger(""+i));
                BigInteger other = n.divide(new BigInteger(""+(i+1)));
                other = other.subtract(new BigInteger("1"));
                s.add(other);
            }
        }
        for(BigInteger l:s){
            out.print(l+" ");
        }
        out.close();
    }
}