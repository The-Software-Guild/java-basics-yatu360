package RockPaperScissors;

import java.util.*;

public class RockPaperScissors {

    public static String play(int user_input){
        Random rand = new Random();
        int bot_input = rand.nextInt(3) + 1;
        if (user_input>3 || user_input<1){
            return "Error: Invalid input";
        }
        else if (user_input==1 && bot_input ==3) {
            return "Player won";
        }
        else if (user_input == 2 && bot_input==1) {
            return "Player won";
        }
        else if (user_input ==3 && bot_input == 2) {
            return "Player won";
        }
        else if (user_input == bot_input) {
            return "Draw";
        }
        return "Player lost";
    }

    public static void game (int rounds){
        boolean done = false;
        Scanner input = new Scanner(System.in);
        int user_input;
        int user_win = 0, bot_win = 0, draw = 0, count = 0;
        String result;
        String winner;

        while (!done) {
            System.out.println("Please enter your choice of weapon, 1 = Rock, 2 = Paper, 3 = Scissors? : ");
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
        } else winner = "Computer Wins!";

        String printout = String.format("User wins: %d, Computer wins: %d, Draws: %d", user_win, bot_win, draw);
        System.out.println(winner);
        System.out.println("Would you like to player again, please enter yes or not: ");
        input.nextLine(); //Bug workaround to force program to wait and ask for command
        String game_restart = input.nextLine();
        if (game_restart.equals("Yes")||game_restart.equals("yes")) {
            rounds();
        }
        input.close();
    }

    public static void rounds (){
        Scanner round_input  = new Scanner(System.in);
        System.out.println("How many rounds would you like to play?");
        int rounds = round_input.nextInt();
        if (rounds>1 && rounds <11){
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
