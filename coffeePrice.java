import java.util.Scanner;

class CoffeeBag{
    final double price_per_pound=150.99;
    final double tax_rate=7.25;
    double total=0.0;
    double totalPrice(double a,double b)
    {
        total=a*b*price_per_pound;
        return total;
    }
    double totalPriceWithTax()
    {
        double tot_price_with_tax=total+(total*tax_rate/100);
        return tot_price_with_tax;
    }
}

class coffeePrice{
    
    public static void main(String[] args)
    {
        double bags,weigth_per_bag;
        Scanner in=new Scanner(System.in);
        System.out.println("Total bags");
        bags=in.nextDouble();
        System.out.println("Weights per bag ");
        weigth_per_bag=in.nextDouble();
        CoffeeBag c1=new CoffeeBag();
        double total_price=c1.totalPrice(bags,weigth_per_bag);
        double tot_price_with_tax=c1.totalPriceWithTax();
        System.out.println("ber of bags sold "+bags);
        System.out.println("Weight per bag "+weigth_per_bag);
        System.out.println("Price per pound "+ c1.price_per_pound);
        System.out.println("Sales tax "+c1.tax_rate);
        System.out.println("Total price "+tot_price_with_tax);

    }
}
