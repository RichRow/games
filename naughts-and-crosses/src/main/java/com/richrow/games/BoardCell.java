package com.richrow.games;

public class BoardCell {

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
