package com.richrow.games;

public class Main {

    public static void main(String[] args) {
        NaughtsAndCrossesBoard game = new NaughtsAndCrossesBoard();
        System.out.println("Current State: " + game.toPrettyString());
        game.updateBoard(CellValue.CROSS, 0, 0);
        game.updateBoard(CellValue.NAUGHT, 1, 2);
        System.out.println("Current State: " + game.toPrettyString());
    }

//    public void playGame() {
//        Player a = new ConsolePlayer("PlayerA"), b = new ConsolePlayer("PlayerB");
//        IRules rules = new ThreeInARow();
//        IBoard board = new NaughtsAndCrossesBoard();
//
//        Game game = new Game(new ConsolePlayer[]{a, b}, rules, board).play();
//    }
//
//    public interface IRules {
//
//    }
//
//
//
//    public interface IPlayer {
//        public String getName();
//
//        public PlayerSymbol getPlayerSymbol();
//
//        public void setPlayerSymbol(PlayerSymbol playerSymbol);
//
//        public Coordinate getMove();
//    }
//
//    public class PlayerSymbol {
//        private final char playerSymbol;
//
//        public PlayerSymbol(char playerSymbol) {
//            this.playerSymbol = playerSymbol;
//        }
//
//    }
//
//    public abstract class Player implements IPlayer {
//        protected String name;
//        protected final PlayerSymbol playerSymbol;
//
//        protected Player(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public PlayerSymbol getPlayerSymbol() {
//            return playerPymbol;
//        }
//
//        public void setPlayerSymbol(PlayerSymbol playerSymbol) {
//            this.playerSymbol = playerSymbol;
//        }
//    }
//
//    public class ConsolePlayer extends Player {
//        public ConsolePlayer(String name) {
//            super(name);
//        }
//
//        public Coordinate getMove() {
//            return null;
//        }
//    }

}
