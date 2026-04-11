import java.util.Scanner;

class NumberAnalysisArray {

    public boolean isPositive(int n) {
        return n >= 0;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        NumberAnalysisArray obj = new NumberAnalysisArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();

            if (obj.isPositive(arr[i])) {
                if (obj.isEven(arr[i]))
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = obj.compare(arr[0], arr[arr.length - 1]);

        if (result == 1)
            System.out.println("First element is greater");
        else if (result == 0)
            System.out.println("Both are equal");
        else
            System.out.println("Last element is greater");

        sc.close();
    }
}