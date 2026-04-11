import java.util.Scanner;

class MatrixAddition {

    public int[][] addMatrices(int[][] a, int[][] b, int r, int c) {

        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        MatrixAddition obj = new MatrixAddition();
        int[][] res = obj.addMatrices(a, b, r, c);

        System.out.println("Result Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}