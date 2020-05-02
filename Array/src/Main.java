import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements you want your array to hold");

        int number = input.nextInt();
        int i;
        int[] array = new int[number];

        System.out.println("\nEnter some elements into your array");
        for(i=0; i <= number; i++){
            array[i] = input.nextInt();
        }
        input.close();

        System.out.println("\n********* The Elements of your array *********");
        for(i = 0; i <= number; i++){
            System.out.println(array[i]+ "\t");
        }
    }
}
