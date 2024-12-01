import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        // instantiate scanner input class
        Scanner input = new Scanner(System.in);
        // Prompt user to enter integer
        System.out.print("Please enter an integer (e.g. 100): ");
        String userInput = input.nextLine();
        // check to see if input is empty/whitespace or has letters
        if (userInput.trim().isEmpty() || Character.isLetter(userInput.charAt(0))) {
            System.out.println("Invalid input. Please enter an integer.");
            input.close();
            return;
        }
        // convert string userInput to long
        long num = Long.parseLong(userInput);
        // DISPLAY results and if user inputs negative use absolute value
        System.out.printf("The sum of the integer %d is %d", num, SumDigits(Math.abs(num)));

        input.close();
    }
    public static int SumDigits(long n) {
        int integerSum = 0;
        // while loop to extract and remove digits to find sum of integer
        while (n != 0) {
            integerSum += n % 10;
            n /= 10;
        }
        return integerSum;
    }
}
