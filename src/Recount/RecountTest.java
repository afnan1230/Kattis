import java.util.*;
import java.io.*;
public class RecountTest{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        Map<String,Integer> m = new TreeMap<String,Integer>();
        while(in.hasNextLine()){
            String line = in.nextLine();
            if(!line.equals("***")){
                if(m.containsKey(line)){
                    m.put(line,m.get(line)+1);
                } else{
                    m.put(line,1);
                }
            }
        }
        int x = Integer.MIN_VALUE;
        ArrayList<String> arr = new ArrayList<String>();
        for(String i: m.keySet()){
            if(m.get(i)>x){
                x = m.get(i);
            }
        }
        for(String i: m.keySet()){
            if (m.get(i)== x){
                arr.add(i);
            }
        }
        if(arr.size()==1){
            System.out.println(arr.get(0));
        }else{
            System.out.println("Runoff!");
        }

    }
}