class RandomArrayStats {

    public int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }

        return arr;
    }

    public double[] findAverageMinMax(int[] arr) {

        int sum = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        double avg = (double) sum / arr.length;

        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {

        RandomArrayStats obj = new RandomArrayStats();

        int[] arr = obj.generate4DigitRandomArray(5);

        System.out.println("Generated Numbers:");

        for (int i : arr)
            System.out.print(i + " ");

        double[] result = obj.findAverageMinMax(arr);

        System.out.println("\nAverage = " + result[0]);
        System.out.println("Min = " + result[1]);
        System.out.println("Max = " + result[2]);
    }
}