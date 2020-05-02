import java.util.Scanner;

public class function {

    public static void  announceDeveloperTeaTime() {
        System.out.println("wait for developer tea time ...");
        System.out.println("Type in a random word and press enter to start developer team tea time");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its now Developer tea time nerds and clone!!!!");
    }

    public static void main(String[] args) {
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get Promoted");
    }
}
