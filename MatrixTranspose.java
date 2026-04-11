import java.util.Scanner;

class MatrixTranspose {

    public int[][] transpose(int[][] a, int r, int c) {

        int[][] t = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = a[i][j];
            }
        }

        return t;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        MatrixTranspose obj = new MatrixTranspose();
        int[][] t = obj.transpose(a, r, c);

        System.out.println("Transpose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}