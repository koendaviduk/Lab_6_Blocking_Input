import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celsius, fahrenheit;
        boolean validInput;

        do {
            System.out.print("Enter a temperature in Celsius: ");

            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit + " °F");
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value for temperature.");
                input.next(); // Consume the invalid input
                validInput = false;
            }
        } while (!validInput);

        input.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
