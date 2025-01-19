package cleancode.minesweeper.tobe.cell;

public interface Cell {

    boolean hasLandMineCount();

    boolean isLandMine();

    CellSnapshot getSnapshot();

    void flag();

    void open();

    boolean isChecked();

    boolean isOpened();

}
