package Question3;

import Question1.ConsoleColors;

public class Tambor extends Instrumento {
    @Override
    public void play() {
        toStriing();
    }

    @Override
    public void toStriing() {
        System.out.println(ConsoleColors.CYAN_BOLD + "Tambor: rufa");
    }
}
