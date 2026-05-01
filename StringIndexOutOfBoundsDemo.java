import java.util.Scanner;

class StringIndexOutOfBoundsDemo {

    public void generate(String text) {
        System.out.println(text.charAt(100)); // invalid index
    }

    public void handle(String text) {
        try {
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        StringIndexOutOfBoundsDemo obj = new StringIndexOutOfBoundsDemo();

        try {
            obj.generate(text);
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }

        obj.handle(text);

        sc.close();
    }
}