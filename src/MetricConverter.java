import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double meters = 0.0;
        boolean validInput;

        // Input for meters
        do {
            System.out.print("Enter a measurement in meters: ");
            if (input.hasNextDouble()) {
                meters = input.nextDouble();
                validInput = meters >= 0; // Ensure a non-negative value
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                input.next(); // Consume the invalid input
                validInput = false;
            }
        } while (!validInput);

        final double miles_Per_Meter = 0.000621371;
        final double feet_Per_Meter = 3.28084;
        final double inches_Per_Meter = 39.3701;

        double miles = meters * miles_Per_Meter;
        double feet = meters * feet_Per_Meter;
        double inches = meters * inches_Per_Meter;

        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);

        input.close();
    }
}

