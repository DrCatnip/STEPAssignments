import java.util.Scanner;

class VowelConsonantCount {

    public int[] count(String text) {

        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    v++;
                else
                    c++;
            }
        }

        return new int[]{v, c};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        VowelConsonantCount obj = new VowelConsonantCount();

        int[] res = obj.count(text);

        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);

        sc.close();
    }
}