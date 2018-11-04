package com.richrow.boardgames.rules;

import com.richrow.boardgames.players.Player;

public interface IRules {
    String getName();
    Player getWinner();
}