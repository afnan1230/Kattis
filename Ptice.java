import java.io.*;
import java.util.*;
public class Ptice {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int questions = in.nextInt();
        in.nextLine();
        int ad = 0; int br = 0; int gor = 0;
        Set<String> s = new TreeSet<String>();
        char[] a = adrian(questions);
        char[] g = goran(questions);
        char[] b = bruno(questions);
        char[] answers = in.nextLine().toCharArray();
        for(int i = 0;i<questions;i++){
            if(answers[i] == a[i]){
                ad++;
            }
            if(answers[i]==b[i]){
                br++;
            }
            if(answers[i] == g[i]){
                gor++;
            }
        }
        int max = Math.max(Math.max(ad,br),gor);
        System.out.println(max);
        if(max == ad){
            System.out.println("Adrian");
        }
        if(max == br){
            System.out.println("Bruno");
        }
        if(max == gor){
            System.out.println("Goran");
        }
    }
    public static char[] goran(int ques){
        char[] c = new char[ques];
        for(int i=0;i<ques;i++){
            if(i%6 ==0 || i%6==1){
                c[i] = 'C';
            }else if(i%6 ==2|| i%6 ==3){
                c[i] = 'A';
            }else{
                c[i] = 'B';
            }
        }
        return c;
    }
    public static char[] adrian(int ques){
        char[] c = new char[ques];
        for(int i=0;i<ques;i++){
            if(i%3==0){
                c[i] = 'A';
            }else if(i%3 ==1){
                c[i] = 'B';
            }else{
                c[i] = 'C';
            }
        }
        return c;
    }
    public static char[] bruno(int ques){
        char[] c = new char[ques];
        for(int i=0;i<ques;i++){
            if(i%4==0 || i%4 ==2){
                c[i] = 'B';
            }else if(i%4 ==1){
                c[i] = 'A';
            }else{
                c[i] = 'C';
            }
        }
        return c;
    }
}