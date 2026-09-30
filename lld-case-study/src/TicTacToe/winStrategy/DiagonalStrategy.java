package TicTacToe.winStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public class DiagonalStrategy implements WinningStrategy {


    @Override
    public boolean checkWin(Board board, Player player) {
        char ch = player.getSymbol().getCharacter();
        int dimension = board.getSize();
        boolean left_diagonal = true;
        boolean right_diagonal = true;

        for (int i = 0; i < dimension; i++) {
            if (board.getCellSymbol(i, i) != ch) {
                left_diagonal = false;
            }
            if (board.getCellSymbol(i,dimension-1-i) != ch) {
                right_diagonal = false;
            }
        }
        return left_diagonal || right_diagonal;
    }
}
