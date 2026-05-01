import java.util.Scanner;

class CharacterType2D {

    public String check(char ch) {

        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch))
            return "Not Letter";

        if ("aeiou".indexOf(ch) != -1)
            return "Vowel";

        return "Consonant";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        CharacterType2D obj = new CharacterType2D();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch + " -> " + obj.check(ch));
        }

        sc.close();
    }
}