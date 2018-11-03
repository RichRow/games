package com.richrow.games;

public class BoardCell {
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

    private CellValue cellValue;

    public BoardCell(CellValue cellValue) {
        this.cellValue = cellValue;
    }

    public CellValue getCellValue() {
        return cellValue;
    }

    public void setCellValue(CellValue cellValue) {
        this.cellValue = cellValue;
    }
}
