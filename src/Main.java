import Game.TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's Play Tic Tac Toe");
        TicTacToe ticTacToe = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        int totalPossibleTurns = ticTacToe.getTotalPossibleTurns();
        int totalTurns = 0;
        boolean isThereAWinner = false;


        while ((totalTurns <= totalPossibleTurns) && !isThereAWinner){
            char currentPlayer = ticTacToe.getCurrentPlayer();
            System.out.println("Make a board selection!");

            int space = scanner.nextInt();
            ticTacToe.pickSpace(space, currentPlayer);
            ticTacToe.displayCurrentStatus();
            isThereAWinner = ticTacToe.checkForWinner();
            totalTurns++;

        }
    }
}