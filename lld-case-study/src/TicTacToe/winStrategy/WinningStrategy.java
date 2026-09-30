package TicTacToe.winStrategy;

import TicTacToe.models.Board;
import TicTacToe.models.Player;

public interface WinningStrategy {
    boolean checkWin(Board board, Player player);
}
