package com.richrow.games;

public enum CellValue {
    NAUGHT('o'), CROSS('x'), UNOCCUPIED('-');
    private char symbol;
    CellValue(char symbol){
        this.symbol=symbol;
    }
    public char getSymbol(){
        return symbol;
    }
}
