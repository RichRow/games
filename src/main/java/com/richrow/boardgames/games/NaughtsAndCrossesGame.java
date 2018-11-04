package com.richrow.boardgames.games;

import com.richrow.boardgames.boards.NaughtsAndCrossesBoard;
import com.richrow.boardgames.players.Player;
import com.richrow.boardgames.rules.ThreeInARow;

public class NaughtsAndCrossesGame extends Game {
    public NaughtsAndCrossesGame(Player[] players) {
        super("Naughts and Crosses", new NaughtsAndCrossesBoard(), new ThreeInARow(), players);
    }
}