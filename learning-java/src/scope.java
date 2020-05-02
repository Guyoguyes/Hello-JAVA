import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        System.out.println("Choose a number");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();
        String favoriteFood = "pizza";

        System.out.println(favoriteFood);
        if (inputtedNum < 100){
            favoriteFood = "chicken wings";
            System.out.println(favoriteFood);
        }else{
            favoriteFood = "Steak";
            System.out.println(favoriteFood);
        }
    }
}
