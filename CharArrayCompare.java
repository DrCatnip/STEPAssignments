import java.util.Scanner;

class CharArrayCompare {

    // Convert string to char array manually
    public char[] getChars(String text) {

        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    // Compare two char arrays
    public boolean compare(char[] a, char[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        CharArrayCompare obj = new CharArrayCompare();

        char[] user = obj.getChars(text);
        char[] built = text.toCharArray();

        System.out.println("Comparison result: " + obj.compare(user, built));

        sc.close();
    }
}