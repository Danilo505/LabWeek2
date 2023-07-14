package Question3;

public class Main {
    public static void main(String[] args) {
        Instrumento guitarra = new Guitarra();
        Instrumento tambor = new Tambor();
        Instrumento trompete = new Trompete();
        Instrumento violao = new Violao();
        Instrumento flauta = new Flauta();
        Instrumento pratos = new Pratos();
        Orquestra orquestra = new Orquestra();
        orquestra.add(guitarra);
        orquestra.add(tambor);
        orquestra.add(trompete);
        orquestra.add(violao);
        orquestra.add(flauta);
        orquestra.add(pratos);
        orquestra.play();

    }
}