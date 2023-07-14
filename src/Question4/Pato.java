package Question4;

import Question1.ConsoleColors;

public class Pato extends Passaro {
    private String name = ConsoleColors.CYAN_BOLD + "Pato";

    public void andar(){
        System.out.println("Pode andar");
    }

    public void nadar(){
        System.out.println("Pode nadar");
    }

    public String getName() {
        return name;
    }


}