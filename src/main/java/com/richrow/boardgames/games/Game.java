package com.richrow.boardgames.games;

import com.richrow.boardgames.boards.Board;
import com.richrow.boardgames.players.Player;
import com.richrow.boardgames.rules.Rules;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class Game implements IGame {
    protected int counter;
    protected String name;
    protected Board board;
    protected Rules rules;
    protected List<Player> players;

    protected Game(String name, Board board, Rules rules, Player[] players) {
        this(name, board, rules, Arrays.asList(players));
    }

    protected Game(String name, Board board, Rules rules, List<Player> players) {
        this.name = name;
        this.board = board;
        this.rules = rules;
        this.players = players;
        counter = 0;
        Collections.shuffle(players, new Random());
    }

    public void play() {
        while (rules.getWinner() == null) {
            nextPlayer(counter++, players).takeTurn(board);
        }
        System.out.println(rules.getWinner().getName() + " won!");
    }

    public Player nextPlayer(int turn, List<Player> players) {
        return players.get(turn % players.size());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRound() {
        return counter;
    }

    public String getNames() {
        players.stream().map(s -> s.getName()).collect(Collectors.joining(","));
        return "game='" + this.getName() + "'," +
                "board='" + board.getName() + "'," +
                "rules='" + rules.getName() + "'," +
                "players='" + players.stream().map(s -> s.getName()).collect(Collectors.joining(",")) + "'";
    }
}