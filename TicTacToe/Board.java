package TicTacToe;

public class Board {
    private final int size;
    private final PlayingPiece[][] board;
    private int positionsFilled;

    Board(final int s) {
        size = s;
        board = new PlayingPiece[s][s];
        positionsFilled = 0;
    }

    boolean addPiece(int row, int column, PlayingPiece piece) {
        if(row < 0 || row >= size || column < 0 || column >= size) {
            System.out.println("Invalid position.");
            return false;
        }

        if(board[row][column] != null) {
            System.out.println("Position already filled.");
            return false;
        }

        board[row][column] = piece;
        ++positionsFilled;
        return true;
    }

    public void print() {
        for(int i=0; i<board.length; ++i) {
            for (int j=0; j<board[i].length; ++j) {
                if (board[i][j] != null)
                    System.out.print(board[i][j] + " ");
                else
                    System.out.print("  ");

                if (j < board[i].length-1)
                    System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public boolean isBoardFull() {
        return positionsFilled == (size*size);
    }

    public boolean isPlayerWon(final int x, final int y, final Player playerTurn) {
        boolean allSame = true;

        for(int i=0; i<board.length; ++i) {
            if(board[x][i] != playerTurn.piece) {
                allSame = false;
                break;
            }
        }

        if(allSame)
            return true;

        allSame = true;
        for(int i=0; i<board.length; ++i) {
            if(board[i][y] != playerTurn.piece) {
                allSame = false;
                break;
            }
        }

        if(allSame)
            return true;

        allSame = true;
        for(int i=0; i<board.length; ++i) {
            if(board[i][i] != playerTurn.piece) {
                allSame = false;
                break;
            }
        }

        if(allSame)
            return true;

        allSame = true;
        for(int i=board.length-1, j=0; i>=0; --i, ++j) {
            if(board[j][i] != playerTurn.piece) {
                allSame = false;
                break;
            }
        }

        return allSame;
    }
}
