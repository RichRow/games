package com.richrow.boardgames;

import com.richrow.boardgames.boards.NaughtsAndCrossesSymbols;
import com.richrow.boardgames.games.Game;
import com.richrow.boardgames.games.NaughtsAndCrossesGame;
import com.richrow.boardgames.players.CommandlinePlayer;
import com.richrow.boardgames.players.Player;

public class Main {

    public static void main(String[] args) {
        new Main().playGame();
    }

    public void playGame() {
        Player a = new CommandlinePlayer("PlayerA", NaughtsAndCrossesSymbols.NAUGHT);
        Player b = new CommandlinePlayer("PlayerB", NaughtsAndCrossesSymbols.CROSS);

        Game game = new NaughtsAndCrossesGame(new Player[]{a, b});

        System.out.println(game.getNames());

        game.play();
    }

}
