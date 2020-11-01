import java.util.*;
import java.io.*;
public class CarouselRide{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("Carousel.txt"));
        int tests = in.nextInt();
        int max = in.nextInt();
        while(tests != 0 && max !=0){
            double minPrice = Double.MAX_VALUE;
            int minTicket = 0;
            double minPricePerTicket = Double.MAX_VALUE;
            for(int i =0;i<tests;i++){
                double pricePerTicket = 0;
                int tickets = in.nextInt();
                int price = in.nextInt();
                if(tickets <=max){
                    pricePerTicket = ((double)price)/tickets;
                    //System.out.println("Price per Ticket: "+ pricePerTicket);
                    //System.out.println("Initial Minimum Price: " + minPrice);
                    if(pricePerTicket<minPricePerTicket){
                        minTicket = tickets;
                        minPrice = price;
                        minPricePerTicket = pricePerTicket;
                       // System.out.println("minTicket: "+minTicket);
                        //System.out.println("MinPrice: " + minPrice);
                    }
                    if(pricePerTicket== minPricePerTicket){
                        if(tickets > minTicket){
                            minTicket = tickets;
                            minPrice = price;
                        }
                    }
                }
            }
            if(minTicket != 0)
                System.out.println("Buy "+ minTicket+" tickets for $"+ ((int)minPrice));
            else
                System.out.println("No suitable tickets offered");
            tests = in.nextInt();
            max = in.nextInt();
    }
    }
}