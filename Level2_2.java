import java.util.Scanner;

class Level2_2 {
 public static void main(String[] args) {

  // Create Scanner Object
  Scanner input = new Scanner(System.in);

  // Get salary and years of service
  double salary = input.nextDouble();
  int yearsOfService = input.nextInt();

  // Create bonus variable
  double bonus = 0;

  // Check if eligible for bonus
  if (yearsOfService > 5) {
   bonus = salary * 0.05;
  }

  // Print bonus
  System.out.println("The bonus amount is " + bonus);

  // Close Scanner
  input.close();
 }
}