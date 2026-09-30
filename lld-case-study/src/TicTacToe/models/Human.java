package TicTacToe.models;

public class Human extends Player {
    private String name;

    public Human(char symbol, String name) {
        super(symbol, PlayerType.HUMAN);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
