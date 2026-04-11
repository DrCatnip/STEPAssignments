class NumberChecker2 {

    public static int sumDigits(int[] digits) {

        int sum = 0;
        for (int d : digits)
            sum += d;

        return sum;
    }

    public static double sumSquares(int[] digits) {

        double sum = 0;

        for (int d : digits)
            sum += Math.pow(d, 2);

        return sum;
    }

    public static boolean isHarshad(int number, int sum) {
        return number % sum == 0;
    }

    public static void main(String[] args) {

        int number = 21;

        int count = NumberChecker1.countDigits(number);
        int[] digits = NumberChecker1.getDigits(number, count);

        int sum = sumDigits(digits);

        System.out.println("Sum = " + sum);
        System.out.println("Sum Squares = " + sumSquares(digits));
        System.out.println("Harshad: " + isHarshad(number, sum));
    }
}