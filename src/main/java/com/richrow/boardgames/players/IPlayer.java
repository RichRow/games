package com.richrow.boardgames.players;

import com.richrow.boardgames.boards.Board;

public interface IPlayer {
    String getName();
    void takeTurn(Board board);
}