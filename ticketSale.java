import java.util.Scanner;
class ticketSale{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Number of tickets sold for Seating A: ");
        int a1=s.nextInt();
        System.out.println("Price of ticket in Seat A");
        double a2=s.nextDouble();
        System.out.println("Number of tickets sold for Seating B: ");
        int b1=s.nextInt();
        System.out.println("Price of ticket in Seating B");
        double b2=s.nextDouble();
        System.out.println("Number of tickets sold for Seating C: ");
        int c1=s.nextInt();
        System.out.println("Price of ticket in Seating C");
        double c2=s.nextDouble();
        double tot_price=(a1*a2)+(b1*b2)+(c1*c2);
        System.out.println("Total Price: "+tot_price);
    }
}
