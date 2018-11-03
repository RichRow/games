package com.richrow.games;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple NaughtsAndCrossesBoard.
 */
public class NaughtsAndCrossesBoardTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NaughtsAndCrossesBoardTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(NaughtsAndCrossesBoardTest.class);
    }

    /**
     *
     */
    public void testEmptyBoard() {
        NaughtsAndCrossesBoard game = new NaughtsAndCrossesBoard();
        String expected = "\n" +
                "\t-\t-\t-\n" +
                "\t-\t-\t-\n" +
                "\t-\t-\t-\n";
        assertEquals("Empty board pretty string test", expected, game.toPrettyString());
    }

    /**
     *
     */
    public void testCoordinates() {
        NaughtsAndCrossesBoard game = new NaughtsAndCrossesBoard();
        String expected = "\n" +
                "\tx\t-\t-\n" +
                "\to\t-\tx\n" +
                "\t-\t-\t-\n";
        game.updateBoard(CellValue.CROSS, 0, 0);
        game.updateBoard(CellValue.NAUGHT, 1, 0);
        game.updateBoard(CellValue.CROSS, 1, 2);
        assertEquals("Board pretty string test after two moves, expected coordinates", expected, game.toPrettyString());
    }
}
