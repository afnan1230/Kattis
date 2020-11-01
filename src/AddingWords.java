import java.io.*;
import java.util.*;
public class AddingWords {
    static Map<String,Integer> words = new HashMap<String,Integer>();
    public static void main(String[] args) throws IOException{
        Scanner  in = new Scanner(System.in);
        while(in.hasNextLine()){
            String[] line = in.nextLine().split(" ");
            if(line[0].equals("def")){
                define(line);
            }else if(line[0].equals("calc")){
                String result = calculate(line);
                for(int i=1;i<line.length;i++){
                    System.out.print(line[i]+ " ");
                    
                }
                System.out.println(result);
            }else{
                clear(words);
            }
        }    
    }
    public static void define(String[] word){
        words.put(word[1],Integer.parseInt(word[2]));
    }
    public static String calculate(String[] calc){
        int i = 1;
        int sum = 0;
        while(!calc[i].equals("=")){
            if(i == 1){
                if(words.get(calc[i]) == null){
                    return "unknown";
                }else{
                    sum += words.get(calc[i]);
                }
                i++;
            }else{
                String operator = calc[i];
                i++;
                if(operator.equals("+")){
                    if(words.get(calc[i])==null){
                        return "unknown";
                    }else{
                        sum+= words.get(calc[i]);
                    }
                }else{
                    if(words.get(calc[i])==null){
                        return "unknown";
                    }else{
                        sum-= words.get(calc[i]);
                    }
                }
                i++;
            }
        }
        return findkey(words, sum);
    }
    public static String findkey(Map<String,Integer> w, int n){
        for(String s: w.keySet()){
            if(w.get(s)== n){
                return s;
            }
        }
        return "unknown";
    }
    public static void clear(Map<String,Integer> w){
        w.clear();
    }
}