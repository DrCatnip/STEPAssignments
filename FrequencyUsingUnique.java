import java.util.Scanner;

class FrequencyUsingUnique {

    // Find unique characters
    public char[] getUnique(String text) {

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

    // Frequency using unique chars
    public void findFrequency(String text, char[] unique) {

        System.out.println("Character\tFrequency");

        for (char ch : unique) {

            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch)
                    count++;
            }

            System.out.println(ch + "\t\t" + count);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        FrequencyUsingUnique obj = new FrequencyUsingUnique();

        char[] unique = obj.getUnique(text);

        obj.findFrequency(text, unique);

        sc.close();
    }
}