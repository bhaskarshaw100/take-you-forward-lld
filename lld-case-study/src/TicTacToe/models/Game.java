package TicTacToe.models;

import TicTacToe.winStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private List<Move> moves = new ArrayList<>();
    private Board board;
    private int currentIndex;
    private GameStatus gameStatus;
    private Player winner;
    private List<WinningStrategy> winningStrategies;

    public static class Builder {
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Game build() {
            Game game = new Game();
            game.players = this.players;
            game.winningStrategies = this.winningStrategies;
            game.board = new Board(this.players.size() + 1);
            game.currentIndex = -1;
            game.gameStatus = GameStatus.IN_PROGRESS;
            return game;
        }
    }

    public void startGame() {
        // Implementation for starting the game
        while (gameStatus.equals(GameStatus.IN_PROGRESS)) {
            currentIndex += 1;
            Player currentPlayer = players.get(currentIndex % players.size());
            board.showBoard();
            if (currentPlayer.getPlayerType() == PlayerType.HUMAN) {
                System.out.println("Player " + currentPlayer.getSymbol().getSymbol() + "'s turn. Please enter your move!");
                System.out.print("Row: ");
                int row = Integer.parseInt(System.console().readLine());
                System.out.print("Column: ");
                int col = Integer.parseInt(System.console().readLine());
                Cell cell = board.updateCell(currentPlayer, row, col);
                Move move = new Move(cell);
                moves.add(move);
            } else {
                System.out.println("Computer " + currentPlayer.getSymbol().getSymbol() + "'s turn.");
            }
            // Check for winner
            for (WinningStrategy strategy : winningStrategies) {
                if (strategy.checkWin(board, currentPlayer)) {
                    gameStatus = GameStatus.WIN;
                    winner = currentPlayer;
                    System.out.println("Player " + winner.getSymbol().getSymbol() + " wins!");
                    board.showBoard();
                    return;
                }
            }
            // Check for draw
            if (moves.size() == board.getSize() * board.getSize()) {
                gameStatus = GameStatus.DRAW;
                System.out.println("The game is a draw!");
                board.showBoard();
                return;
            }
        }
    }
}
