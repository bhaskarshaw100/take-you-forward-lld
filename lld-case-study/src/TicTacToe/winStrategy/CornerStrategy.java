package TicTacToe.winStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public class CornerStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board, Player player) {
        char ch = player.getSymbol().getCharacter();
        int dimension = board.getSize();

        if (board.getCellSymbol(0,0) == ch && board.getCellSymbol(0,dimension-1) == ch
                && board.getCellSymbol(dimension - 1,0) == ch && board.getCellSymbol(dimension - 1,dimension - 1) == ch) {
            return true;
        }
        return false;
    }
}
