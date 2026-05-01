import java.util.Scanner;

class IllegalArgumentDemo {

    public void generate(String text) {
        System.out.println(text.substring(5, 2)); // invalid
    }

    public void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        IllegalArgumentDemo obj = new IllegalArgumentDemo();

        try {
            obj.generate(text);
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }

        obj.handle(text);

        sc.close();
    }
}