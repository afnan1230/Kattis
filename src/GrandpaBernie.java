import java.io.*;
import java.util.*;

public class GrandpaBernie {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(in.readLine());
        HashMap<String,ArrayList<Integer>> places = new HashMap<String,ArrayList<Integer>>();
        while(n-->0){
            String[] line = in.readLine().split(" ");
            if(places.get(line[0])==null){
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(Integer.parseInt(line[1]));
                places.put(line[0],arr);
            }else{
                places.get(line[0]).add(Integer.parseInt(line[1]));
            }
        }
        HashSet<String> visited = new HashSet<String>();
        int cases = Integer.parseInt(in.readLine());
        while(cases-->0){
            String[] line = in.readLine().split(" ");
            String location = line[0];
            int time = Integer.parseInt(line[1]);
            if(visited.contains(location)){
                out.println(places.get(location).get(time-1));
            }else{
                Collections.sort(places.get(location));
                out.println(places.get(location).get(time-1));
            }
            visited.add(location);
        }
        out.close();

    }
}