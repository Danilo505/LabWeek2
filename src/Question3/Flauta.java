package Question3;

import Question1.ConsoleColors;

public class Flauta extends Instrumento {
    @Override
    public void play() {
        toStriing();
    }

    @Override
    public void toStriing() {
        System.out.println(ConsoleColors.BLUE_BOLD + "Flauta: apita");
    }
}