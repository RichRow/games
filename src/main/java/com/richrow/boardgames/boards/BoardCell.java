package com.richrow.boardgames.boards;

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
