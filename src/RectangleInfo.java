import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double width = 0.0, height = 0.0;
        boolean validInput;

        // Input for width
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (input.hasNextDouble()) {
                width = input.nextDouble();
                validInput = width > 0; // Ensure a positive value
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                input.next(); // Consume the invalid input
                validInput = false;
            }
        } while (!validInput);

        // Input for height
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (input.hasNextDouble()) {
                height = input.nextDouble();
                validInput = height > 0; // Ensure a positive value
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                input.next(); // Consume the invalid input
                validInput = false;
            }
        } while (!validInput);

        double area = width * height;

        double perimeter = 2 * (width + height);

        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);

        input.close();
    }
}

