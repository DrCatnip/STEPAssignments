import java.util.Scanner;

class StringCompare {

    // Method to compare two strings using charAt()
    public boolean compareStrings(String s1, String s2) {

        // If lengths differ → not equal
        if (s1.length() != s2.length())
            return false;

        // Compare character by character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        StringCompare obj = new StringCompare();

        boolean result = obj.compareStrings(s1, s2);

        // Built-in comparison
        boolean builtIn = s1.equals(s2);

        System.out.println("User-defined result: " + result);
        System.out.println("Built-in result: " + builtIn);

        sc.close();
    }
}