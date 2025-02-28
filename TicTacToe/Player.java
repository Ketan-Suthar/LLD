package TicTacToe;

public class Player {
    final String name;
    final PlayingPiece piece;

    Player(final String name, final PlayingPiece p) {
        this.name = name;
        piece = p;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPiece() {
        return piece;
    }

    public String toString() {
        return name + "(" + piece + ")";
    }
}
