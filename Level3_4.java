import java.util.Scanner;

class Level3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime)
            System.out.println(number + " is Prime");
        else
            System.out.println(number + " is not Prime");

        sc.close();
    }
}