package Question3;

import Question1.ConsoleColors;

public class Guitarra extends Instrumento {
    @Override
    public void play() {
        toStriing();
    }

    @Override
    public void toStriing() {
        System.out.println(ConsoleColors.GREEN_BOLD + "Orquestra: ");
        System.out.println(ConsoleColors.RED_BOLD + "Guitarra: soa");
    }
}