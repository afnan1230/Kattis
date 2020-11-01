import java.io.*;
import java.util.*;
public class Leap{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int queries = in.nextInt();
        int[] movesNeeded = new int[days];
        for(int i=0;i<days;i++){
            int move = moves(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
            movesNeeded[i] = move;
        }
        for(int i = 0;i<queries;i++){
            int sum = 0;
            int start = in.nextInt()-1;
            int end = in.nextInt();
            for(int j=start;j<end;j++){
                if(movesNeeded[j]<50){
                    sum+= 50 - movesNeeded[j];
                }
            }
            System.out.println(sum);
        }
    }
    public static int moves(int xStart, int yStart, int xEnd,int yEnd,int right,int left,int front, int back){
        int currX = xStart;
        int currY = yStart;
        int xMoves ;
        int xMovesBack = 0;
        int xMovesFront = 0;
        int yMovesBack=0;
        int yMovesFront=0;
        int yMoves;
        while((Math.abs(xEnd-currX)%right!=0 && currX>1)|| currX>xEnd){
            currX-= left;
            xMovesBack++;
            if(currX<1){
                currX = 1;
            }
        }
        if(Math.abs(xEnd-currX)%right==0){
            xMovesBack+= Math.abs(xEnd - currX)/right;
        }else{
            xMovesBack = Integer.MAX_VALUE;
        }
        currX = xStart;
        while((Math.abs(xEnd-currX)%left!=0 && currX<500)|| currX<xEnd){
            currX+= right;
            xMovesFront++;
            if(currX>500){
                currX = 500;
            }
        }
        if(Math.abs(xEnd-currX)%left==0){
            xMovesFront+= Math.abs(xEnd - currX)/left;
        }else{
            xMovesFront = Integer.MAX_VALUE;
            
        }
        
        xMoves = Math.min(xMovesBack,xMovesFront);
        while((Math.abs(yEnd-currY)%front!=0 && currY>1)|| currY>yEnd){
            currX-= back;
            yMovesBack++;
            if(currY<1){
                currY = 1;
            }
        }
        if(Math.abs(yEnd-currY)%front==0){
            yMovesBack+= Math.abs(yEnd - currY)/front;
        }else{
            yMovesBack = Integer.MAX_VALUE;
        }
        currY = yStart;
        while((Math.abs(yEnd-currY)%back!=0 && currY<500)|| currY<yEnd){
            currY+= front;
            yMovesFront++;
            if(currY>500){
                currY = 500;
            }
        }
        if(Math.abs(yEnd-currY)%back==0){
            yMovesFront+= Math.abs(yEnd - currY)/left;
        }else{
            yMovesFront = Integer.MAX_VALUE;
        }
        yMoves = Math.min(yMovesBack,yMovesFront);
        return xMoves + yMoves;
    }
}