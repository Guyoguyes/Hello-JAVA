import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("Lets calculate the area of a triangle");

        Scanner input = new Scanner(System.in);
        System.out.println("Input the base of a triangle");
        double base = input.nextDouble();

        while(base <= 0){
            System.out.println("Invalid base length");
            base = input.nextDouble();
        }

        System.out.println("Input the height of the triangle");
        double height = input.nextDouble();

        while(height <= 0){
            System.out.println("invalid height");
            height = input.nextDouble();
        }

        System.out.println("calculating the area of the triangle ........");
        double area = (base * height)/2;
        System.out.println("The area of the triangle is " +area);
    }
}
