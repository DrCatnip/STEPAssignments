import java.util.Scanner;

class Level2_1 {
 public static void main(String[] args) {

  // Create Scanner Object
  Scanner input = new Scanner(System.in);

  // Get user input
  int number = input.nextInt();

  // Check if number is natural
  if (number > 0) {

   // Run loop from 1 to number
   for (int i = 1; i <= number; i++) {

    // Check odd or even
    if (i % 2 == 0) {
     System.out.println(i + " is Even");
    } else {
     System.out.println(i + " is Odd");
    }

   }

  } else {
   System.out.println("The number is not a natural number");
  }

  // Close Scanner
  input.close();
 }
}