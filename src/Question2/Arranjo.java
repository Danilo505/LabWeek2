package Question2;

public abstract class Arranjo<T extends Comparable<T>> {
    protected T[] arr;

    public Arranjo(T[] arr){
        this.arr = arr;
    }

    public abstract void classificar();

    public abstract void sort();




    public abstract void list();


    //Métodos de sobrescrição do ByteList, usado para remover e adicionar elementos do tipo Byte
    public  void add(Byte elemento){

    }
    public  void remove(Byte elemento){

    }

    //Métodos de sobrescrição do CharList, usado para remover e adicionar elementos do tipo Char
    public  void remove(Character elemento){

    }
    public  void add(Character elemento){

    }

    //Métodos de sobrescrição do DoubleList, usado para remover e adicionar elementos do tipo Double
    public  void add(Double elemento){

    }

    public  void remove(Double elemento){

    }
    //Métodos de sobrescrição do FloatList, usado para remover e adicionar elementos do tipo Float
    public  void add(Float elemento){

    }

    public  void remove(Float elemento){

    }

    //Métodos de sobrescrição do IntegerList, usado para remover e adicionar elementos do tipo Int
    public  void add(Integer elemento){

    }
    public  void remove(Integer elemento){

    }
    //Métodos de sobrescrição do LongList, usado para remover e adicionar elementos do tipo Long
    public void remove(Long elemento){

    }
    public void add(Long elemento){

    }
    //Métodos de sobrescrição do ShortList, usado para remover e adicionar elementos do tipo Short
    public  void add(Short elemento){

    }

    public  void remove(Short elemento){

    }
}