import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args){
        String firstName, lastName, loginName;
        int grade, studentId;
        float GPA;

        System.out.println("Please enter the following information so I" +
                "I can sell it for a profit!");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("First name: ");
        firstName = scanner.next();
        System.out.print("Last name: ");
        lastName = scanner.next();
        System.out.print("Grade (9-12): ");
        grade = scanner.nextInt();
        System.out.print("Student ID: ");
        studentId = scanner.nextInt();
        System.out.print("Login: ");
        loginName = scanner.next();
        System.out.print("GPA (0.0-4.0): ");
        GPA = scanner.nextFloat();

        System.out.println("Your information: \n\t" +
                "Login: " + loginName + "\n\t" +
                "ID:    " + studentId + "\n\t" +
                "Name:  " + lastName + ", " + firstName + "\n\t" +
                "GPA:   " + GPA + "\n\t" +
                "Grade: " + grade
        );
    }
}
