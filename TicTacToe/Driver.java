package TicTacToe;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Starting new game of tic tac toe...");
            TicTacToe ticTacToe = new TicTacToe(3);
            ticTacToe.start();
            System.out.println("new game(1/0)?");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            if(!"1".equals(s)){
                break;
            }
        }
    }
}
