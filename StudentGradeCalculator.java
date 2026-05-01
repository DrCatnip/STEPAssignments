import java.util.Scanner;

class StudentGradeCalculator {

    // Calculate percentage
    public double percentage(int p, int c, int m) {
        return (p + c + m) / 3.0;
    }

    // Assign grade
    public String grade(double per) {

        if (per >= 80) return "A";
        else if (per >= 70) return "B";
        else if (per >= 60) return "C";
        else if (per >= 50) return "D";
        else if (per >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        StudentGradeCalculator obj = new StudentGradeCalculator();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Physics, Chemistry, Maths: ");
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            double per = obj.percentage(p, c, m);

            System.out.println("Percentage: " + per);
            System.out.println("Grade: " + obj.grade(per));
        }

        sc.close();
    }
}