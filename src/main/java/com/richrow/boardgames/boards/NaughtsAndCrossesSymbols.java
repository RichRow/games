package com.richrow.boardgames.boards;

public enum NaughtsAndCrossesSymbols {
    NAUGHT('o'), CROSS('x'), UNOCCUPIED('_'), UNAVAILABLE('#');
    private char symbol;

    NaughtsAndCrossesSymbols(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

}