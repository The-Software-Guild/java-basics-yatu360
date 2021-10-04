package RockPaperScissors;
import java.util.*;

public class RockPaperScissors {

    /**
     * @param user_input is the user's choice of move. This method generate the computers random move and checks
     * who won. Also checks if the input is valid.
     */
    public static String play(int user_input){
        Random rand = new Random();
        int bot_input = rand.nextInt(3) + 1;
        if (user_input>3 || user_input<1){
            return "Error: Invalid input";
        }
        else if (isPlayerWon(user_input, bot_input)) {
            return "Player won";
        }
        else if (user_input == bot_input) {
            return "Draw";
        }
        return "Player lost";
    }

    private static boolean isPlayerWon(int user_input, int bot_input) {
        return (user_input == 1 && bot_input == 3)
                || (user_input == 2 && bot_input == 1)
                || (user_input == 3 && bot_input == 2);
    }

    /**
     * Parameter is an integer containing the number of rounds.
     * Main game method which loops until number of valid rounds is complete. Valid rounds are rounds where either the
     * player wins, computer wins or draw. Invalid rounds are when the user inputs a non valid input. The win/loss count
     * is stored in this method. If user wants to continue play, rounds method is called again.
     */
    public static void game (int rounds){
        boolean done = false;
        Scanner input = new Scanner(System.in);
        int user_input;
        int user_win = 0, bot_win = 0, draw = 0, count = 0;
        String result;
        String winner;

        while (!done) {
            System.out.println("Please enter your weapon of choice, 1 = Rock, 2 = Paper, 3 = Scissors? : ");
            user_input = input.nextInt();
            result = play(user_input);
            System.out.println(result);
            switch (result) {
                case "Player won":
                    user_win++;
                    count++;
                    break;
                case "Player lost":
                    bot_win++;
                    count++;
                    break;
                case "Draw":
                    draw++;
                    count++;
                    break;
                default:
                    break;
            }
            if (count == rounds) done = true;
        }

        if (user_win>bot_win){
            winner = "Player Wins!";
        }else if(user_win==bot_win) winner = "tie";
        else winner = "Computer Wins!";

        String printout = String.format("User wins: %d, Computer wins: %d, Draws: %d", user_win, bot_win, draw);
        System.out.println(printout);
        System.out.println(winner);
        System.out.println("Would you like to player again, please enter yes or no: ");
        input.nextLine(); //Bug workaround to force program to wait and ask for command
        String game_restart = input.nextLine();
        if (game_restart.equals("Yes")||game_restart.equals("yes")) { //Checks if user wants to play again
            rounds();
        }
        input.close();
    }

    /**
     *Asks user for input via console for number of rounds, if number of rounds is greater than 10, prints error and
     * exits program issuing -1.
     */
    public static void rounds (){
        Scanner round_input  = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
        int rounds = round_input.nextInt();
        if (rounds>0 && rounds <11){
            game(rounds);
        }else{
            System.out.println("Error: incorrect rounds input");
            System.exit(-1);
        }
        round_input.close();
    }

    public static void main(String[] args) {
        rounds();
        System.out.println("Thanks for playing!");
    }
}
