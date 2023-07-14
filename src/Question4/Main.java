package Question4;

public class Main {
    public static void main(String[] args) {
        Mascote m1 = new Gato();
        Mascote m2 = new Pato();
        Mascote m3 = new Largato();
        Mascote m4 = new Cobra();
        Mascote m5 = new Falcao();
        Mascote m6 = new Morcego();
        Jogador jogador = new Jogador();
        jogador.AdquirirMascote(m1);
        jogador.AdquirirMascote(m2);
        jogador.AdquirirMascote(m3);
        jogador.AdquirirMascote(m4);
        jogador.AdquirirMascote(m5);
        jogador.AdquirirMascote(m6);
        jogador.showMascotes();
    }
}