package com.krillinator.game;

/**A Dice game with 1 or 2 Dice plays with two players*/

public class Main {
    public static void main(String[] args) {


        // Instantiate Objects
        Die dice = new Die(0);

        Player player1 = new Player("Henrik ");
        Opponent opponent = new Opponent("CPU ");

        // some int for keep record of each player
        int resultPlayer1 = player1.throwDie();
        System.out.println(player1.getName() + "rolled a " + resultPlayer1);
        int resultOpponent = opponent.throwDie();
        System.out.println(opponent.getName() + "rolled a " + resultOpponent);

        // a win condition that decides who wins, lose, or it's a tie.
        if (resultPlayer1 > resultOpponent){
            System.out.println(player1.getName() + " Wins");
        }else if (resultPlayer1 < resultOpponent) {
            System.out.println(opponent.getName() + " Wins");

        }else {
            System.out.println("It's a tie game");
        }
    }
}
