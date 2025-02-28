package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToe {
    private Board board;
    private Deque<Player> players;

    TicTacToe(final int s) {
        initGame(s);
    }

    private void initGame(final int s) {
        players = new LinkedList<>();
        players.add(new Player("Player 1", new PlayingPieceO()));
        players.add(new Player("Player 2", new PlayingPieceX()));

        board = new Board(s);
    }

    public void start() {
        while (true) {
            board.print();

            if(board.isBoardFull()) {
                System.out.println("Tie");
                break;
            }

            Player playerTurn = players.getFirst();

            System.out.print(playerTurn + " it's your turn, enter position: ");
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String[] values = s.split(" ");
            if(values.length < 2) {
                System.out.println("Invalid position, enter again: ");
                continue;
            }
            int x = Integer.parseInt(values[0]);
            int y = Integer.parseInt(values[1]);

            boolean pieceAdded = board.addPiece(x, y, playerTurn.getPiece());

            if(!pieceAdded) {
                continue;
            }

            boolean playerWon = board.isPlayerWon(x, y, playerTurn);
            if(playerWon) {
                board.print();
                System.out.println(playerTurn + " WON!!!");
                break;
            }

            players.removeFirst();
            players.addLast(playerTurn);
        }
    }
}
