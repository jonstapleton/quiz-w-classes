import java.util.Scanner;

public class Question {
    // instance variables
    public String question = "??";
    public int answer = 0;
    
    // and evaluating the answer
    public void ask() {
        Scanner s = new Scanner(System.in);
        
        // Question 1
        System.out.println("What is " + question + "?");
        int userInput = s.nextInt();

        if(userInput == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
