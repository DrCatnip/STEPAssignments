import java.util.Scanner;

class YoungestTallestFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minIndex])
                minIndex = i;

            if (height[i] > height[maxIndex])
                maxIndex = i;
        }

        System.out.println("Youngest: " + names[minIndex]);
        System.out.println("Tallest: " + names[maxIndex]);

        sc.close();
    }
}