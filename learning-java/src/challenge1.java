import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        String question = "What is my favourite programming language";
        String choiceOne = "PHP";
        String choiceTwo = "javascript";
        String choiceThree = "Java";

        System.out.println(question);
        System.out.println("choose from the following "
                + choiceOne + " " + choiceTwo + " " + choiceThree);


        String correctAnswer = choiceTwo;

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("You have the correct answer");
        }else{
            System.out.println("You are in correct the correct answer is "+correctAnswer);
        }
    }
}