import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat){
            System.out.println("playing current song");
            System.out.println("Would you like to take this song off repeat? If o, answer yes or no");

            String userInput = input.next();

            if(userInput.equals("yes")){
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}
