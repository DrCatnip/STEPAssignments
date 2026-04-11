import java.util.Scanner;

class ChocolateDistribution {

    public int[] distribute(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        ChocolateDistribution obj = new ChocolateDistribution();
        int[] result = obj.distribute(chocolates, children);

        System.out.println("Each child gets = " + result[0]);
        System.out.println("Remaining chocolates = " + result[1]);

        sc.close();
    }
}