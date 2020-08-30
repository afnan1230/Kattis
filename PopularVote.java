import java.io.*;
import java.util.*;
public class PopularVote{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int i=0;i<cases;i++){
            int numMaxes = 0;
            int max = 0;
            int maxCan=0;
            int total = 0;
            int candidates = in.nextInt();
            for(int j=0;j<candidates;j++){
                int num = in.nextInt();
                total+= num;
                if(num>max){
                    max = num;numMaxes = 1;maxCan = j+1;
                }else if(num == max){
                    numMaxes++;
                }
            }
            if(numMaxes==1){
                if(max> total/2){
                    System.out.println("majority winner "+ maxCan);
                }else{
                    System.out.println("minority winner "+ maxCan);
                }
            }else{
                System.out.println("no winner");
            }
        }
    }
}