package com.richrow.boardgames.rules;

import com.richrow.boardgames.players.Player;

public class ThreeInARow extends Rules {
    public ThreeInARow() {
        super("Three in a Row to Win");
    }

//    public boolean isMoveValid(Board board, Coordinate coordinate){
//        board.isAvailable(coordinate);
//
//
//    }

//    public List<Coordinate> getValidMoves(Board board){
//
//    }

    @Override
    public Player getWinner() {
        return null;
    }
}