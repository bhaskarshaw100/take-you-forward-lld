package TicTacToe.winStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public class VerticalStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Board board, Player player) {
        char ch = player.getSymbol().getCharacter();
        int dimension = board.getSize();
        for (int j = 0; j < dimension; j++) {
            for (int i = 0; i < dimension; i++) {
                if (board.getCellSymbol(i, j) != ch) {
                    break;
                }
                if (i == dimension - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
