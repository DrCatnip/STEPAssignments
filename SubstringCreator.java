import java.util.Scanner;

class SubstringCreator {

    // Create substring using charAt()
    public String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Compare two strings
    public boolean compare(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        SubstringCreator obj = new SubstringCreator();

        String userSub = obj.createSubstring(text, start, end);
        String builtSub = text.substring(start, end);

        System.out.println("User substring: " + userSub);
        System.out.println("Built-in substring: " + builtSub);

        System.out.println("Are equal: " + obj.compare(userSub, builtSub));

        sc.close();
    }
}