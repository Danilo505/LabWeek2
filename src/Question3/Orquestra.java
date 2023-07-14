package Question3;

public class Orquestra {
    Instrumento[] orquestraIntrumentos = new Instrumento[1];

    public void add(Instrumento instrumento){
        int index = orquestraIntrumentos.length;
        if (orquestraIntrumentos[index-1] == null){
            orquestraIntrumentos[index -1] = instrumento;
        }else{
            Instrumento[] newOrquestraIntrumentos = new Instrumento[index + 1];
            System.arraycopy(orquestraIntrumentos,0,newOrquestraIntrumentos,0,orquestraIntrumentos.length);
            orquestraIntrumentos = newOrquestraIntrumentos;

            orquestraIntrumentos[index] = instrumento;

        }
    }

    public void play(){
        for (Instrumento orquestraIntrumento : orquestraIntrumentos) {
            orquestraIntrumento.play();
        }
    }

    public void play(int posicao){
        orquestraIntrumentos[posicao- 1].play();
    }
}