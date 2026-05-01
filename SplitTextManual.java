import java.util.Scanner;

class SplitTextManual {

    // Count words
    public int countWords(String text) {

        int count = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                count++;
        }

        return count;
    }

    // Split manually
    public String[] split(String text) {

        int words = countWords(text);
        String[] arr = new String[words];

        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ')
                word += text.charAt(i);
            else {
                arr[index++] = word;
                word = "";
            }
        }

        arr[index] = word;

        return arr;
    }

    public boolean compare(String[] a, String[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        SplitTextManual obj = new SplitTextManual();

        String[] user = obj.split(text);
        String[] built = text.split(" ");

        System.out.println("Match: " + obj.compare(user, built));

        sc.close();
    }
}