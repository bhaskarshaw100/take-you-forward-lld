package TicTacToe;

import TicTacToe.models.*;
import TicTacToe.winStrategy.DiagonalStrategy;
import TicTacToe.winStrategy.HorizontalStrategy;
import TicTacToe.winStrategy.VerticalStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game!\n");
        System.out.println("Let's start playing!\n");
        System.out.println("How many players are going to play?: ");
        int numPlayers = Integer.parseInt(System.console().readLine());
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter the name of player " + (i + 1) + ": ");
            String playerName = System.console().readLine();
            System.out.println("Enter the symbol for player : " + playerName);
            char playerSymbol = System.console().readLine().charAt(0);
            // Create a new Player object and add it to the players list
            Player player = new Human(playerSymbol, playerName);
            players.add(player);
        }
        if (numPlayers == 1) {
            System.out.println("Starting a game with 1 player and 1 computer player.");
            System.out.println("Enter Difficulty level for computer player (EASY, MEDIUM, HARD): ");
            String difficultyLevel = System.console().readLine();
            System.out.println("Enter the symbol for computer player: ");
            char computerSymbol = System.console().readLine().charAt(0);
            // Add a computer player to the players list
            Player computerPlayer = new Bot(computerSymbol, DifficultyLevel.valueOf(difficultyLevel.toUpperCase()));
            players.add(computerPlayer);
        }
        // Create a new Game object and start the game
        Game game = new Game.Builder()
                .setPlayers(players)
                .setWinningStrategies(List.of(new HorizontalStrategy(), new VerticalStrategy(), new DiagonalStrategy()))
                .build();
        game.startGame();
    }
}
