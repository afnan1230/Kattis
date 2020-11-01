
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class DataStruct {

	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			int opCount=Integer.parseInt(s);
			Stack<Integer> stk=new Stack<>(); boolean stkOK=true;
			Queue<Integer> q=new LinkedList<>(); boolean qOK=true;
			PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); boolean pqOK=true;
			
			for (int i=0;i<opCount;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				String op=st.nextToken();
				int value=Integer.parseInt(st.nextToken());
				if (op.equals("1")) {
					if (stkOK) stk.push(value);
					if (qOK) q.offer(value);
					if (pqOK) pq.offer(value);
				} else if (op.equals("2")) {
					if (stkOK && (stk.size()==0 || !stk.pop().equals(value))) stkOK=false;
					if (qOK && (q.size()==0 || !q.poll().equals(value))) qOK=false;
					if (pqOK && (pq.size()==0 || !pq.poll().equals(value))) pqOK=false;
				}
			}
			
			if (!stkOK && !qOK && !pqOK) System.out.println("impossible");
			else if ((stkOK && qOK) || (stkOK && pqOK) || (qOK && pqOK)) System.out.println("not sure");
			else if (stkOK) System.out.println("stack");
			else if (qOK) System.out.println("queue");
			else if (pqOK) System.out.println("priority queue");
		}
	}
}// import java.io.*;
// import java.util.*;
// public class DataStruct{
//     public static void main(String[] args) throws IOException{
//         Scanner in = new Scanner(System.in);
//         Stack<Integer> s = new Stack<Integer>();
//         Queue<Integer> q = new LinkedList<Integer>();
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
//         boolean stack = true; boolean queue= true;boolean pqueue = true;
        
//         while(in.hasNextInt()){
//             int cases = in.nextInt();
//             for(int i=0;i<cases;i++){
//                 int command = in.nextInt();
//                 int val = in.nextInt();
//                 if(command ==1){
//                     if(stack) s.push(val);
//                     if(queue) q.add(val);
//                     if(pqueue) pq.add(val);
//                 }else if(command ==2){
//                     if(stack &&(s.size()==0|| !s.pop().equals(val))) stack = false;
//                     if(queue &&(q.size()==0|| !q.poll().equals(val))) queue = false;
//                     if(pqueue &&(pq.size()==0|| !pq.poll().equals(val))) pqueue = false;
//                 }
//             }
//             if(stack && !queue&&!pqueue) System.out.println("stack");
//             else if(!stack && !queue&&pqueue) System.out.println("priority queue");
//             else if(!stack && queue&&!pqueue) System.out.println("queue");
//             else if(!stack && !queue&&!pqueue) System.out.println("impossible");
//             else System.out.println("not sure");
//             s.clear();
//             q.clear();
//             pq.clear();
//             stack = true; queue = true; pqueue = true;
            
//             /*while(!((!stack&&!queue&&!pqueue)&&(!stack&&!queue&&pqueue)&&(!stack&&queue&&!pqueue)&&(stack&&!queue&&!pqueue)) && cases>=1){
//                 if(in.nextInt() == 1){
//                     int insert = in.nextInt();
//                     s.push(insert);
//                     q.add(insert);
//                     pq.add(new Integ(insert));
//                 }else{
//                     int pop = in.nextInt();
//                     stack = pop == s.pop();
//                     queue = pop == q.remove();
//                     pqueue = pop == pq.remove().getInt();
//                 }
//                 if((stack&&!queue&&!pqueue)||(!stack&&!queue&&pqueue)||(!stack&&queue&&!pqueue)||(!stack&&!queue&&!pqueue)){
//                     for(int i=0;i<cases-1;i++){
//                         in.nextInt();in.nextInt();
//                     }
//                     break;
//                 }
//                 cases--;
//             }
//             if(stack&&!queue&&!pqueue){
//                 System.out.println("stack");
//             }else if(!stack&&!queue&&pqueue){
//                 System.out.println("priority queue");
//             }else if(!stack&&queue&&!pqueue){
//                 System.out.println("queue");
//             }else if(!stack&&!queue&&!pqueue){
//                 System.out.println("impossible");
//             }else{
//                 System.out.println("not sure");
//             }
//             s.clear();
//             pq.clear();
//             q.clear();
//             stack = true;queue= true;pqueue = true;
//             */
//         }
    
//     }
// }
// /*class Integ implements Comparable{
//     private int i;
//     public Integ(int i){
//         this.i = i;
//     }
//     public int compareTo(Object o){
//         Integ other = (Integ)o;
//         return other.i - this.i;
//     }
//     public int getInt(){
//         return i;
//     }
// }*/