package Question3;

import Question1.ConsoleColors;

public class Violao extends Instrumento {
    @Override
    public void play() {
        toStriing();
    }

    @Override
    public void toStriing() {
        System.out.println(ConsoleColors.PURPLE_BOLD + "Violão: soa");
    }
}
