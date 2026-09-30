package TicTacToe.models;

public class Player {
    private Symbol symbol;
    private PlayerType playerType;

    Player(char ch, PlayerType playerType) {
        this.symbol = new Symbol(ch);
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Move makeMove(Board board) {
        // Implementation for making a move

        return null;
    }
}
