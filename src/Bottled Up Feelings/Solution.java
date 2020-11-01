import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File ("text.txt"));
        int oil = in.nextInt();
        int x = oil;
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int num1 = 0;
        int num2 = 0;
        boolean done = false;
        x = 4;  
        while(oil>=v2){
            if(oil%v1 ==0){
                break;
            }
            oil-=v2;
            num2+=1;
        }
        while(oil>=v1){
            oil -= v1;
            num1+=1;
        }
        if(oil !=0){
            System.out.println("Impossible");
        } else{
            System.out.println(num1 +" " +num2);
        }
    }
}