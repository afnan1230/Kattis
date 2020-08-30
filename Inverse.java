import java.io.*;
import java.util.*;
public class Inverse {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int cases = 1;
        while(in.hasNextLine()){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int determinant = (a*d)-(b*c);
            int newA = d/determinant;
            int newD = a/determinant;
            int newB = -b/determinant;
            int newC = -c/determinant;
            System.out.println("Case "+ cases+":");
            System.out.println(newA+" "+newB);
            System.out.println(newC+" "+newD);
            cases++;
            in.nextLine();
            in.nextLine();
        }

    }
}