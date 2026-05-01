import java.util.Scanner;

class ShortestLongestWord {

    public String[] find(String[] words) {

        String min = words[0];
        String max = words[0];

        for (String w : words) {

            if (w.length() < min.length())
                min = w;

            if (w.length() > max.length())
                max = w;
        }

        return new String[]{min, max};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        ShortestLongestWord obj = new ShortestLongestWord();

        String[] result = obj.find(words);

        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);

        sc.close();
    }
}