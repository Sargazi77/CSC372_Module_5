import java.util.Scanner;

public class ProductOfNumbers {

    // Recursive method to calculate the product of numbers
    public static int productOfNumbers(int count, int product) {
        // Base case: when the count reaches 0, return the product
        if (count == 0) {
            return product;
        } else {
            // Ask the user to input a number
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            // Multiply the current product by the entered number
            int newProduct = product * num;

            // Recursive call, reducing the count by 1
            return productOfNumbers(count - 1, newProduct);
        }
    }

    // Main method where the program starts
    public static void main(String[] args) {
        // Inform the user what the program does
        System.out.println("This program will calculate the product of 5 numbers using recursion.");

        // Start the recursion with 5 numbers and an initial product of 1
        int result = productOfNumbers(5, 1);

        // Display the final product
        System.out.println("The product of the numbers is: " + result);
    }
}