package TicTacToe.models;

public class Symbol {
    private char character;

    public Symbol(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public String getSymbol() {
        return String.valueOf(character);
    }
}
