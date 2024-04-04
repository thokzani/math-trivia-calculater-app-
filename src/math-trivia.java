import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class MathTriviaGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeSet<Integer> answers = new TreeSet<Integer>();
        System.out.println("Welcome to the Math Trivia Game!");
        while (true) {
            int num1 = new Random().nextInt(10) + 1;
            int num2 = new Random().nextInt(10) + 1;
            String[] operators = {"+", "-", "*", "/"};
            String operator = operators[new Random().nextInt(operators.length)];
            System.out.printf("%d %s %d = ", num1, operator, num2);
            int userAnswer = input.nextInt();
            int correctAnswer = 0;
            switch (operator) {
                case "+":
                    correctAnswer = num1 + num2;
                    break;
                case "-":
                    correctAnswer = num1 - num2;
                    break;
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                case "/":
                    correctAnswer = num1 / num2;
                    break;
            }
            if (userAnswer == correctAnswer) {
                answers.add(userAnswer);
            }
            if (userAnswer == 999) {
                break;
            }
        }
        System.out.println("Answers saved to TreeSet:");
        for (int answer : answers) {
            System.out.println(answer);
        }
        input.close();
    }
}
