package com.richrow.boardgames.players;

import com.richrow.boardgames.boards.Board;
import com.richrow.boardgames.boards.NaughtsAndCrossesSymbols;

import java.util.Scanner;

public class CommandlinePlayer extends Player {
    private Scanner sc = new Scanner(System.in);

    private NaughtsAndCrossesSymbols symbol;

    public CommandlinePlayer(String name, NaughtsAndCrossesSymbols symbol) {
        super(name);
        this.symbol = symbol;
        System.out.println("Hello, " + name + ". Would you like to playGame a game?");
    }

    @Override
    public void takeTurn(Board board) {
        System.out.println("" + name + ", make a move.");
        System.out.println(board.toString());
        System.out.println("enter coordinate: <x,y>");
        String input = sc.nextLine();
        while (!board.isValidMove(input)) {
            System.out.println("Invalid move, try again.");
            input = sc.nextLine();
        }
        board.makeMove(input, symbol);
    }



}