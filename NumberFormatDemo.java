import java.util.Scanner;

class NumberFormatDemo {

    public void generate(String text) {
        int n = Integer.parseInt(text); // may fail
        System.out.println(n);
    }

    public void handle(String text) {
        try {
            int n = Integer.parseInt(text);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        NumberFormatDemo obj = new NumberFormatDemo();

        try {
            obj.generate(text);
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }

        obj.handle(text);

        sc.close();
    }
}