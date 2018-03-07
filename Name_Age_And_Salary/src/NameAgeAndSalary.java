import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        String name;
        int age;
        float salary;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        name = scanner.next();
        System.out.println();

        System.out.println("Hi, " + name + "! How old are you?");
        age = scanner.nextInt();
        System.out.println();

        System.out.println("So you're " + age + ", eh? That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        salary = scanner.nextFloat();
        System.out.println();

        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }
}
