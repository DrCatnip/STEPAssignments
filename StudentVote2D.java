import java.util.Scanner;

class StudentVote2D {

    // Create 2D result array
    public String[][] checkVotes(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0)
                result[i][1] = "Invalid";
            else if (ages[i] >= 18)
                result[i][1] = "Can Vote";
            else
                result[i][1] = "Cannot Vote";
        }

        return result;
    }

    // Display table
    public void display(String[][] data) {

        System.out.println("Age\tStatus");

        for (String[] row : data)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
        }

        StudentVote2D obj = new StudentVote2D();

        obj.display(obj.checkVotes(ages));

        sc.close();
    }
}