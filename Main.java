import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Question q1 = new Question();
        q1.question = "2 + 2";
        q1.answer = 4;
        q1.ask();

        Question q2 = new Question();
        q2.question = "5 + 2";
        q2.answer = 7;
        q2.ask();
        
    }
}