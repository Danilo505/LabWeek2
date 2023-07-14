package Question4;

import Question1.ConsoleColors;

public class Morcego extends Mamifero {
    private String name = ConsoleColors.CYAN_BOLD + "Morcego";

    public void voar(){
        System.out.println("Pode voar");
    }

    public String getName() {
        return name;
    }

}
