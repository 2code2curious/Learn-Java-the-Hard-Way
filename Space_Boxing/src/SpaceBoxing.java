import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        double weight;
        double relativeGravity;
        int planetNumber;

        System.out.print("Please enter your current earth weight: ");
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextDouble();
        System.out.println();

        System.out.println("I have information for the following planets:\n" +
                " 1. Venus  2. Mars  3. Jupiter\n 4. Saturn  5. Uranus  6. Neptune");
        System.out.println();
        System.out.print("Which planet are you visiting? ");
        planetNumber = scanner.nextInt();

        if(planetNumber == 1) {
            weight = weight * 0.78;
        } else if(planetNumber == 2) {
            weight = weight * 0.39;
        } else if(planetNumber == 3) {
            weight = weight * 2.65;
        } else if(planetNumber == 4) {
            weight = weight * 1.17;
        } else if(planetNumber == 5) {
            weight = weight * 1.05;
        } else if (planetNumber == 6) {
            weight = weight * 1.23;
        }

        System.out.println();
        System.out.println("Your weight would be " + weight + " pounds " +
                "on that planet.");
    }
}
