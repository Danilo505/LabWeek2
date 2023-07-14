package Question4;

import Question1.ConsoleColors;

public class Cobra extends Reptil {
    private String name = ConsoleColors.CYAN_BOLD + "Cobra";

    @Override
    public String getName() {
        return name;
    }
}
