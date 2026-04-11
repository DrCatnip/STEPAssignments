import java.util.Scanner;

class EmployeeBonus {

    public double calculate(double salary, double years) {
        return years > 5 ? salary * 0.05 : salary * 0.02;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        EmployeeBonus obj = new EmployeeBonus();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter salary: ");
            double s = sc.nextDouble();

            System.out.print("Enter years: ");
            double y = sc.nextDouble();

            double bonus = obj.calculate(s, y);

            System.out.println("Bonus = " + bonus);
            System.out.println("New Salary = " + (s + bonus));
        }

        sc.close();
    }
}