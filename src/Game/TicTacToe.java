package Game;

import java.util.ArrayList;

public class TicTacToe {

    private char[] sequence = {' ',' ',' ', ' ', ' ', ' ', ' ', ' ', ' '};
    private ArrayList<char[]> possibleSolutions = new ArrayList<char[]>();

    private char currentPlayer = 'X';

    public int getTotalPossibleTurns() {
        return sequence.length;
    }

    public void pickSpace(int space, char player) {
        this.sequence[space - 1] = player;
        switchCurrentPlayer();
    }

    public void displayCurrentStatus() {
        System.out.println(" " + sequence[0] + " | " + sequence[1] + " | " + sequence[2]);
        System.out.println("-------------");
        System.out.println(" " + sequence[3] + " | " + sequence[4] + " | " + sequence[5]);
        System.out.println("-------------");
        System.out.println(" " + sequence[6] + " | " + sequence[7] + " | " + sequence[8]);
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchCurrentPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public boolean checkForWinner() {
        //come up with algo
        if (sequence[0] == 'X' && sequence[1] == 'X' && sequence[2] == 'X') {
            System.out.println("X won!!");
            return true;
        } else if (sequence[0] == 'O' && sequence[1] == 'O' && sequence[2] == 'O') {
            System.out.println("O won!!");
            return true;
        } else if (sequence[3] == 'X' && sequence[4] == 'X' && sequence[5] == 'X') {
            System.out.println("X won!!");
            return true;
        }
        else if (sequence[3] == 'O' && sequence[4] == 'O' && sequence[5] == 'O') {
            System.out.println("O won!!");
            return true;
        }
        return false;
    }


}
