import java.util.Scanner;

class SpringSeason {

    public boolean isSpring(int m, int d) {
        return (m == 3 && d >= 20) ||
                (m > 3 && m < 6) ||
                (m == 6 && d <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        SpringSeason obj = new SpringSeason();

        if (obj.isSpring(m, d))
            System.out.println("It is Spring Season");
        else
            System.out.println("It is not Spring Season");

        sc.close();
    }
}