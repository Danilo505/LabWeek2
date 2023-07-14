package Question4;

import Question1.ConsoleColors;

public class Jogador {
    private Mascote[] mascotes = new Mascote[1];

    public void AdquirirMascote(Mascote animal){
        int index = mascotes.length;

        if (mascotes[index - 1] == null){
            mascotes[index-1] = animal;
        }else{
            Mascote[] newMascotes = new Mascote[index + 1];
            System.arraycopy(mascotes,0,newMascotes,0,mascotes.length);
            mascotes = newMascotes;

            mascotes[index] = animal;
        }
    }

    public void showMascotes(){
        System.out.println(ConsoleColors.CYAN_BOLD + "O jogador tem animais de estimação:");
        int cont = 1;
        for (Mascote mascote:mascotes) {
            System.out.println(" ");
            System.out.printf("M%d %s",cont, mascote.getName());
            System.out.println(" ");
            cont += 1;
        }
    }
}
