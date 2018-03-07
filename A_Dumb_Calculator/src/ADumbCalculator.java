import java.util.Scanner;

public class ADumbCalculator {
    public static void main(String[] args){
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first number? ");
        a = scanner.nextDouble();

        System.out.print("What is your second number? ");
        b = scanner.nextDouble();

        System.out.print("What is your third number? ");
        c = scanner.nextDouble();

        System.out.println("(" + a + " + " + b + " + " + c + ") / 2 is... " +
                (a+b+c)/2);
    }
}
