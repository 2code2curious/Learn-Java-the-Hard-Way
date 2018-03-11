import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        int count = 0;
        String response;
        int answer;
        System.out.print("Are you ready for a quiz? ");
        Scanner scanner = new Scanner(System.in);
        response = scanner.next();
        if(response.equalsIgnoreCase("Y")) {
            System.out.println("Okay, here it comes!");
            System.out.println();

            System.out.println("Q1) What is the capital of Alaska?\n\t" +
                    "1) Melbourne\n\t" +
                    "2) Anchorage\n\t" +
                    "3) Juneau");
            System.out.println();
            answer = scanner.nextInt();
            if(answer == 3) {
                count++;
                System.out.println("You are right.");
            } else {
                System.out.println("Oops! That's incorrect answer.");
            }

            System.out.println();
            System.out.println("Q2) Can you store the value \"cat\" in a variable " +
                    "of type int?\n\t" +
                    "1) yes\n\t" +
                    "2) no");
            System.out.println();
            answer = scanner.nextInt();
            if(answer == 1) {
                System.out.println("Sorry, \"cat\" is a string. ints can only store" +
                        " numbers");
            } else {
                count++;
                System.out.println("That's right.");
            }

            System.out.println();
            System.out.println("Q3) What is the result of 9+6/3?\n\t" +
                    "1) 5\n\t" +
                    "2) 11\n\t" +
                    "3) 15/3");
            System.out.println();
            answer = scanner.nextInt();
            if(answer == 2) {
                count++;
                System.out.println("That's correct!");
            } else {
                System.out.println("Your answer is incorrect.");
            }

            System.out.println();
            System.out.println("Overall, you got " + count + " out of " +
                    "3 correct.");
            System.out.println("Thanks for playing!");

        } else {

        }
    }
}