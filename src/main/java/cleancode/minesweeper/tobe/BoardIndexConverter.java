package cleancode.minesweeper.tobe;

import cleancode.studycafe.asis.exception.AppException;

public class BoardIndexConverter {

    private static final char BASE_CHAR_FOR_COL = 'a';

    public int getSelectedColIndex(String cellInput) {
        char cellInputCol = cellInput.charAt(0);
        return convertColFrom(cellInputCol);
    }

    public int getSelectedRowIndex(String cellInput) {
        String cellInputRow = cellInput.substring(1);
        return convertRowFrom(cellInputRow);
    }

    private int convertRowFrom(String cellInputRow) {
        int rowIndex = Integer.parseInt(cellInputRow) - 1;
        if (rowIndex < 0) {
            throw new AppException("잘못된 입력 입니다.");
        }

        return rowIndex;
    }

    private int convertColFrom(char cellInputCol) {
        int colIndex = cellInputCol - BASE_CHAR_FOR_COL;
        if (colIndex < 0) {
            throw new AppException("잘못된 입력 입니다.");
        }

        return colIndex;
    }
}
