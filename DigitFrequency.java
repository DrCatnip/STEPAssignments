import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Invalid number");
            sc.close();
            return;
        }

        // Count digits
        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Frequency array (0–9)
        int[] freq = new int[10];

        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }

        // Display result
        System.out.println("Digit frequencies:");

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}