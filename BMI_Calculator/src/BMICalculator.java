import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        double height, weight;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your height in m: ");
        height = scanner.nextDouble();
        System.out.print("Your weight in kg: ");
        weight = scanner.nextDouble();
        System.out.println();

        System.out.println("Your BMI is " + weight / (height * height));
    }
}
