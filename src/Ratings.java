import java.io.*;
import java.util.*;
public class Ratings{
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        int rated = in.nextInt();
        int desired = in.nextInt();
        int sum = 0;
        for(int i=0;i<rated;i++){
            sum+= in.nextInt();
        }
        double numNeeded = (desired*rated-sum)/(double)(10-desired);
        System.out.println((int)Math.ceil(numNeeded));
    }
}