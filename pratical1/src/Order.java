import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Pizza order1 = new Pizza("large", "soft", "pineapple");
//
//
//        double priceOrder1 = order1.makeOrder();
//        System.out.println(priceOrder1);


        Pizza order2 = new Pizza(input.next(), input.next(), input.next());
        System.out.println("Order 2");
        double priceOrder2 = order2.makeOrder();
        System.out.println(priceOrder2);
    }
}
