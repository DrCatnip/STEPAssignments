import java.util.Scanner;

class FrequencyNestedLoop {

    public void findFrequency(String text) {

        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            freq[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0'; // mark duplicate
                }
            }
        }

        System.out.println("Character\tFrequency");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != '0') {
                System.out.println(arr[i] + "\t\t" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        new FrequencyNestedLoop().findFrequency(text);

        sc.close();
    }
}