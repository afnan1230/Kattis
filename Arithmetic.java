import java.io.*;
import java.util.*;
import java.math.*;
public class Arithmetic {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        BigInteger oct = new BigInteger(in.readLine(),8);
        String ot = oct.toString(16);
        ot = ot.toUpperCase();
        out.println(ot);
        out.close();
    }
}