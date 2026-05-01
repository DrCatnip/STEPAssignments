import java.util.Scanner;

class PalindromeChecker3Ways {

    // Method 1: Iterative
    public boolean check1(String text) {

        int start = 0, end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }

        return true;
    }

    // Method 2: Recursive
    public boolean check2(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return check2(text, start + 1, end - 1);
    }

    // Method 3: Reverse
    public boolean check3(String text) {

        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--)
            rev += text.charAt(i);

        return text.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        PalindromeChecker3Ways obj = new PalindromeChecker3Ways();

        System.out.println("Method1: " + obj.check1(text));
        System.out.println("Method2: " + obj.check2(text, 0, text.length() - 1));
        System.out.println("Method3: " + obj.check3(text));

        sc.close();
    }
}