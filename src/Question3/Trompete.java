package Question3;

import Question1.ConsoleColors;

public class Trompete extends Instrumento {
    @Override
    public void play() {
        toStriing();
    }

    @Override
    public void toStriing() {
        System.out.println(ConsoleColors.YELLOW_BOLD + "Trompete: apita");
    }
}
