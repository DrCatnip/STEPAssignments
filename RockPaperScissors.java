import java.util.Scanner;

class RockPaperScissors {

    // Computer choice
    public int computerChoice() {
        return (int)(Math.random() * 3); // 0,1,2
    }

    // Decide winner
    public String winner(int user, int comp) {

        if (user == comp)
            return "Draw";

        if ((user == 0 && comp == 2) ||
                (user == 1 && comp == 0) ||
                (user == 2 && comp == 1))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        RockPaperScissors obj = new RockPaperScissors();

        int userWins = 0, compWins = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter choice (0-Rock,1-Paper,2-Scissors): ");
            int user = sc.nextInt();

            int comp = obj.computerChoice();

            String result = obj.winner(user, comp);

            System.out.println("Computer: " + comp + " Result: " + result);

            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) compWins++;
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);

        sc.close();
    }
}