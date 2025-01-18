package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.Advanced;
import cleancode.minesweeper.tobe.gamelevel.Beginner;
import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.gamelevel.Middle;
import cleancode.minesweeper.tobe.gamelevel.VeryBeginner;

public class GameApplication {

    public static void main(String[] args) {
        GameLevel veryBeginner = new VeryBeginner();
        GameLevel beginner = new Beginner();
        GameLevel middle = new Middle();
        GameLevel advanced = new Advanced();

        Minesweeper minesweeper = new Minesweeper(veryBeginner);
        minesweeper.run();
    }

}
