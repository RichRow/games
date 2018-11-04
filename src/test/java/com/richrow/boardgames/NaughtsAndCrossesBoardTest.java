package com.richrow.boardgames;

import com.richrow.boardgames.boards.NaughtsAndCrossesSymbols;
import com.richrow.boardgames.games.Game;
import com.richrow.boardgames.games.NaughtsAndCrossesGame;
import com.richrow.boardgames.players.CommandlinePlayer;
import com.richrow.boardgames.players.Player;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple NaughtsAndCrossesBoardOld.
 */
public class NaughtsAndCrossesBoardTest {
    /**
     *
     */
    @Test
    public void testCoordinates() {
        Player a = new CommandlinePlayer("PlayerA", NaughtsAndCrossesSymbols.NAUGHT);
        Player b = new CommandlinePlayer("PlayerB", NaughtsAndCrossesSymbols.CROSS);

        Game game = new NaughtsAndCrossesGame(new Player[]{a, b});
//        assertEquals("Board pretty string test after two moves, expected coordinates", expected, game.toPrettyString());
    }
}
