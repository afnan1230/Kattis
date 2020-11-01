import java.io.*;
import java.util.*;
public class Astro {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        String[] firstStart = in.nextLine().split(":");
        int fStart = Integer.parseInt(firstStart[0])*60 + Integer.parseInt(firstStart[1]);
        String[] secStart = in.nextLine().split(":");
        int sStart = Integer.parseInt(secStart[0])*60 + Integer.parseInt(secStart[1]);
        String[] fPat = in.nextLine().split(":");
        int firstPat = Integer.parseInt(fPat[0])*60 + Integer.parseInt(fPat[1]);
        String[] sPat = in.nextLine().split(":");
        int secPat = Integer.parseInt(sPat[0])*60 + Integer.parseInt(sPat[1]);
        Set<Integer> s = new HashSet<Integer>();
        for(int i=fStart;i<(int)1e7;i+=firstPat){
            s.add(i);
        }
        for(int i =sStart;i<(int)1e7;i+=secPat){
            if(s.contains(i)){
                int day = (i/60/24)%7;
                System.out.println(days[day]);
                System.out.printf("%02d:",i/60%24);
                System.out.printf("%02d",i%60);
                return;
            }
        }
        System.out.println("Never");
    }
}
