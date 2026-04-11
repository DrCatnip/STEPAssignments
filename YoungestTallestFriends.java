import java.util.Scanner;

class YoungestTallestFriends {

    public int findYoungest(int[] age) {

        int min = age[0];

        for (int i = 1; i < age.length; i++) {
            if (age[i] < min)
                min = age[i];
        }

        return min;
    }

    public double findTallest(double[] height) {

        double max = height[0];

        for (int i = 1; i < height.length; i++) {
            if (height[i] > max)
                max = height[i];
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
        }

        YoungestTallestFriends obj = new YoungestTallestFriends();

        System.out.println("Youngest age = " + obj.findYoungest(age));
        System.out.println("Tallest height = " + obj.findTallest(height));

        sc.close();
    }
}