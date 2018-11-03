package com.richrow.games;

/**
 * Naughts and Crosses!
 */
public class NaughtsAndCrossesBoard {
    private int width, height;

    private BoardCell[][] board;

    public NaughtsAndCrossesBoard() {
        this.width = 3;
        this.height = 3;
        board = new BoardCell[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = new BoardCell(CellValue.UNOCCUPIED);
            }
        }
    }

    public void updateBoard(CellValue value, int x, int y) {
        board[x][y].setCellValue(value);
    }

    public String toPrettyString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sb.append("\t" + board[i][j].getCellValue().getSymbol());
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        NaughtsAndCrossesBoard game = new NaughtsAndCrossesBoard();
        System.out.println("Current State: " + game.toPrettyString());
        game.updateBoard(CellValue.CROSS, 0, 0);
        game.updateBoard(CellValue.NAUGHT, 1, 2);
        System.out.println("Current State: " + game.toPrettyString());
    }
}
