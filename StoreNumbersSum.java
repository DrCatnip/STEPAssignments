import java.util.Scanner;

class StoreNumbersSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0;
        int index = 0;

        while (index < arr.length) {

            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0)
                break;

            arr[index] = num;
            sum += num;
            index++;
        }

        System.out.println("Numbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}