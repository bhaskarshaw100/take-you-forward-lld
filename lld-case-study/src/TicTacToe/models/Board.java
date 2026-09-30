package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> cells;

    public Board(int size) {
        this.size = size;
        this.cells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            this.cells.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                this.cells.get(i).add(new Cell(i, j));
            }
        }
    }

    public void showBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = cells.get(i).get(j);
                if (cell.getPlayer() == null) {
                    System.out.print("-");
                } else {
                    System.out.print(cell.getPlayer().getSymbol().getSymbol());
                }
                if (j < size - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < size - 1) {
                System.out.println("---------");
            }
        }
    }

    public Cell updateCell(Player player, int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new IllegalArgumentException("Invalid move: out of bounds");
        }
        if (cells.get(row).get(col).getPlayer() != null) {
            throw new IllegalArgumentException("Invalid move: cell already occupied");
        }
        Cell cell = cells.get(row).get(col);
        cell.setPlayer(player);
        return cell;
    }

    public Cell getCell(int row, int col) {
        return cells.get(row).get(col);
    }

    public char getCellSymbol(int row, int col) {
        Cell cell = cells.get(row).get(col);
        if (cell.getPlayer() == null) {
            return '-';
        } else {
            return cell.getPlayer().getSymbol().getCharacter();
        }
    }

    public int getSize() {
        return size;
    }
}
