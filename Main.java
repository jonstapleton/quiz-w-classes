import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What is 2 + 2?");
        int ans = s.nextInt();

        if(ans == 4) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }

        // End the quiz
        System.out.println("That's all the questions!");
        s.close();
    }
}