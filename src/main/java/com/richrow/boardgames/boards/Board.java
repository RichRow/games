package com.richrow.boardgames.boards;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Board implements IBoard {
    protected Pattern pattern = Pattern.compile("^(\\d+),(\\d+)$");
    protected String name;
    protected NaughtsAndCrossesSymbols[][] board;

    protected Board(String name, int x, int y) {
        this.name = name;
        board = new NaughtsAndCrossesSymbols[x][y];
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[j][i] = NaughtsAndCrossesSymbols.UNOCCUPIED;
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    public void makeMove(String desiredMove, NaughtsAndCrossesSymbols symbol) {
        Coordinate coordinate = parseAsCoordinate(desiredMove);
        board[coordinate.getX()][coordinate.getY()] = symbol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
               sb.append(String.format("%5s", board[j][i].getSymbol()));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean isValidMove(String desiredMove) {
        try {
            Coordinate coordinate = parseAsCoordinate(desiredMove);
            int x = coordinate.getX();
            int y = coordinate.getY();
            return x >= 0 & x < board.length & y >= 0 & y < board[0].length &
                    board[x][y].equals(NaughtsAndCrossesSymbols.UNOCCUPIED) &
                    board[x][y].equals(NaughtsAndCrossesSymbols.UNAVAILABLE);
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println();
            return false;
        }
    }

    private Coordinate parseAsCoordinate(String input) throws IllegalArgumentException {
        Matcher matcher = pattern.matcher(input);
        int x = -1, y = -1;
        if (matcher.find()) {
            x = Integer.valueOf(matcher.group(1));
            y = Integer.valueOf(matcher.group(2));
        }
        if (x == -1 | y == -1) {
            throw new IllegalArgumentException("ERROR: input='" + input + "'is not a valid coordinate.");
        }
        return new Coordinate(x, y);
    }
}
