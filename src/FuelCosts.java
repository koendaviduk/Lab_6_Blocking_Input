import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gallonsInTank, fuelEfficiency, gasPrice;
        boolean validInput;

        // Initialize variables
        gallonsInTank = fuelEfficiency = gasPrice = 0.0;

        // Input for gallons in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (input.hasNextDouble()) {
                gallonsInTank = input.nextDouble();
                validInput = gallonsInTank >= 0; // Ensure a non-negative value
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                input.next(); // Consume the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Input for fuel efficiency
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (input.hasNextDouble()) {
                fuelEfficiency = input.nextDouble();
                validInput = fuelEfficiency > 0; // Ensure a positive value
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                input.next(); // Consume the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Input for gas price
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (input.hasNextDouble()) {
                gasPrice = input.nextDouble();
                validInput = gasPrice >= 0; // Ensure a non-negative value
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                input.next(); // Consume the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Calculate cost per 100 miles
        double costPer100Miles = (100.0 / fuelEfficiency) * gasPrice;

        // Calculate distance car can go with the gas in the tank
        double distance = gallonsInTank * fuelEfficiency;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");

        input.close();
    }
}
