import java.util.Scanner;

class WordLength2D {

    public String[] split(String text) {

        return text.split(" "); // reuse built-in for simplicity
    }

    public String[][] create2D(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        WordLength2D obj = new WordLength2D();

        String[][] data = obj.create2D(obj.split(text));

        System.out.println("Word\tLength");

        for (String[] row : data)
            System.out.println(row[0] + "\t" + row[1]);

        sc.close();
    }
}