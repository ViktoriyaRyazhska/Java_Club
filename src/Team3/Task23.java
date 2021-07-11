package Team3;

import java.util.Scanner;

public class Task23 {
    public static String ScissorsRockPaper(String player1 ,String player2){
        if(player1.equals("scissors") && player2.equals("rock"))
            return ("Player 2 won!!!");

        else if(player1.equals("rock") && player2.equals("scissors"))
            return ("Player 1 won!!!");

        else if(player1.equals("scissors") && player2.equals("scissors"))
            return ("Draw!!!");

        else if(player1.equals("rock") && player2.equals("rock"))
            return ("Draw!!!");

        else if(player1.equals("rock") && player2.equals("paper"))
            return ("Player 2 won!!!");

        else if(player1.equals("scissors") && player2.equals("paper"))
            return ("Player 1 won!!!");

        else if(player1.equals("rock") && player2.equals("paper"))
            return ("Player 2 won!!!");

        else if(player1.equals("paper") && player2.equals("paper"))
            return ("Draw!!!");

        else if(player1.equals("paper") && player2.equals("rock"))
            return ("Player 1 won!!!");

        else if(player1.equals("paper") && player2.equals("scissors"))
            return("Player 2 won!!!");
        return ("");
    }
    public static void showFunctionality(){
        System.out.println("This program this program implements the game Rock Paper Scissors");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 'scissors' or 'paper' or 'rock' for first player:");
        String player1 = console.nextLine();
        System.out.println("Enter 'scissors' or 'paper' or 'rock' for second player:");
        String player2 = console.nextLine();
        String game = ScissorsRockPaper(player1,player2);
        System.out.println(game);
    }}