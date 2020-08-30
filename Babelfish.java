import java.io.*;
import java.util.*;
public class Babelfish {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        Map<String,String> dict = new HashMap<String,String>();
        while(in.hasNextLine()){
            String[] words = in.nextLine().split(" ");
            if(words.length ==2){
                dict.put(words[1],words[0]);
            }else if(!words[0].equals("")){
                if(dict.containsKey(words[0])){
                    System.out.println(dict.get(words[0]));
                }else{
                    System.out.println("eh");
                }
            }
        }
    }
}