import java.util.Scanner;

class CalendarDisplayFull {

    // Get month name
    public String getMonthName(int m) {

        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        return months[m - 1];
    }

    // Check leap year
    public boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // Get number of days in month
    public int getDays(int m, int y) {

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (m == 2 && isLeap(y))
            return 29;

        return days[m - 1];
    }

    // Find first day using Gregorian formula
    public int getFirstDay(int d, int m, int y) {

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0; // 0 = Sunday
    }

    // Display calendar
    public void display(int m, int y) {

        System.out.println("\n   " + getMonthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(1, m, y);
        int days = getDays(m, y);

        // spacing before first day
        for (int i = 0; i < firstDay; i++)
            System.out.print("    ");

        // print dates
        for (int i = 1; i <= days; i++) {

            System.out.printf("%3d ", i);

            if ((i + firstDay) % 7 == 0)
                System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        CalendarDisplayFull obj = new CalendarDisplayFull();

        obj.display(m, y);

        sc.close();
    }
}