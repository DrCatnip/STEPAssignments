import java.util.Scanner;

class TrimStringManual {

    // Find start and end indexes after trimming spaces
    public int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Remove leading spaces
        while (start < text.length() && text.charAt(start) == ' ')
            start++;

        // Remove trailing spaces
        while (end >= 0 && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    // Create substring using charAt()
    public String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++)
            result += text.charAt(i);

        return result;
    }

    // Compare two strings
    public boolean compare(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        TrimStringManual obj = new TrimStringManual();

        int[] idx = obj.trimIndexes(text);

        String user = obj.createSubstring(text, idx[0], idx[1]);
        String built = text.trim();

        System.out.println("User Trim: " + user);
        System.out.println("Built-in Trim: " + built);
        System.out.println("Match: " + obj.compare(user, built));

        sc.close();
    }
}