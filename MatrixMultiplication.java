import java.util.Scanner;

class MatrixMultiplication {

    public int[][] multiply(int[][] a, int[][] b, int r1, int c1, int c2) {

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter cols of Matrix B: ");
        int c2 = sc.nextInt();

        int[][] a = new int[r1][c1];
        int[][] b = new int[c1][c2];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < c1; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        MatrixMultiplication obj = new MatrixMultiplication();
        int[][] res = obj.multiply(a, b, r1, c1, c2);

        System.out.println("Result Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}