import java.util.Scanner;

class CalendarDisplay {

    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int getDays(int m, int y) {

        int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (m == 2 && isLeap(y)) return 29;
        return d[m - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int days = getDays(m, y);

        System.out.println("Days = " + days);

        sc.close();
    }
}