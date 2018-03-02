import java.util.Scanner;

public class StillUsingVariables {
    public static void main(String[] args){
       String name;
       int year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = scanner.next();
        System.out.println("Enter your graduation year");
        year = scanner.nextInt();

        System.out.println("My name is " + name +
                " and I'll graduate in " + year + ".");
    }
}
