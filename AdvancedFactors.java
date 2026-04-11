class AdvancedFactors {

    public int[] getFactors(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;

        int[] factors = new int[count];
        int idx = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors[idx++] = i;

        return factors;
    }

    public int maxFactor(int[] arr) {
        return arr[arr.length - 1];
    }

    public int sum(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum += i;
        return sum;
    }

    public int product(int[] arr) {
        int p = 1;
        for (int i : arr)
            p *= i;
        return p;
    }

    public double cubeProduct(int[] arr) {
        double p = 1;
        for (int i : arr)
            p *= Math.pow(i, 3);
        return p;
    }

    public static void main(String[] args) {

        AdvancedFactors obj = new AdvancedFactors();

        int[] f = obj.getFactors(10);

        System.out.println("Max Factor = " + obj.maxFactor(f));
        System.out.println("Sum = " + obj.sum(f));
        System.out.println("Product = " + obj.product(f));
        System.out.println("Cube Product = " + obj.cubeProduct(f));
    }
}