import java.util.Scanner;

class StringLengthWithoutLength {

    // Find length without using length()
    public int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // when exception occurs → end reached
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        StringLengthWithoutLength obj = new StringLengthWithoutLength();

        int len = obj.findLength(text);

        System.out.println("User length: " + len);
        System.out.println("Built-in length: " + text.length());

        sc.close();
    }
}