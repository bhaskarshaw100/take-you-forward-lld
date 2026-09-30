package TicTacToe.models;

public class Bot extends Player {
    private DifficultyLevel difficultyLevel;

    public Bot(char symbol, DifficultyLevel difficultyLevel) {
        super(symbol, PlayerType.COMPUTER);
        this.difficultyLevel = difficultyLevel;
    }
}
