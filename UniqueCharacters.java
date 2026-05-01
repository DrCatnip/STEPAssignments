import java.util.Scanner;

class UniqueCharacters {

    public char[] findUnique(String text) {

        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique)
                temp[count++] = text.charAt(i);
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        UniqueCharacters obj = new UniqueCharacters();

        char[] res = obj.findUnique(text);

        for (char c : res)
            System.out.print(c + " ");

        sc.close();
    }
}