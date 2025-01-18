package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.Advanced;
import cleancode.minesweeper.tobe.gamelevel.Beginner;
import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.gamelevel.Middle;
import cleancode.minesweeper.tobe.gamelevel.VeryBeginner;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameLevel veryBeginner = new VeryBeginner();
        GameLevel beginner = new Beginner();
        GameLevel middle = new Middle();
        GameLevel advanced = new Advanced();

        InputHandler inputHandler = new ConsoleInputHandler();
        OutputHandler outputHandler = new ConsoleOutputHandler();

        Minesweeper minesweeper = new Minesweeper(veryBeginner, inputHandler, outputHandler);
        minesweeper.run();
    }

}
