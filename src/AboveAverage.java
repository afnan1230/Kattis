import java.io.*;
import java.util.*;

public class AboveAverage {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();
        for(int i = 0; i < cases; i++){
            String[] line = in.nextLine().split(" ");
            int people = Integer.parseInt(line[0]);
            double sum = 0;
            for(int j=0;j<people;j++){
                sum+= Integer.parseInt(line[j+1]);
            }
            double avg = sum/people;
            int count = 0;
            for(int k = 0;k<people;k++){
                if(Integer.parseInt(line[k+1])>avg){
                    count++;
                }
            }
            System.out.printf("%.3f",(((double)count)/people)*100);
            System.out.println("%");
        }
    }
}