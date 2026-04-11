class NumberChecker3 {

    public static int[] reverse(int[] arr) {

        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];

        return rev;
    }

    public static boolean isPalindrome(int[] arr) {

        int[] rev = reverse(arr);

        for (int i = 0; i < arr.length; i++)
            if (arr[i] != rev[i])
                return false;

        return true;
    }

    public static void main(String[] args) {

        int number = 121;

        int count = NumberChecker1.countDigits(number);
        int[] digits = NumberChecker1.getDigits(number, count);

        System.out.println("Palindrome: " + isPalindrome(digits));
    }
}