import java.util.Scanner;

class FrequencyASCII {

    public void find(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < 256; i++)
            if (freq[i] > 0)
                System.out.println((char)i + " -> " + freq[i]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        new FrequencyASCII().find(text);

        sc.close();
    }
}