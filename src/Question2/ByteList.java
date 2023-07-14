package Question2;

import Question1.ConsoleColors;

import java.util.Arrays;
import java.util.Objects;

public class ByteList extends Arranjo<Byte> {
    private Byte[] arr;

    public ByteList() {
        super(null);
        arr = new Byte[1];

    }

    @Override
    public void classificar() {
        System.out.println(ConsoleColors.PURPLE_BOLD + "\nEsse é um Array Byte");
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) ->Byte.compare(b,a));


    }
    @Override
    public void add(Byte elemento) {
        int index = arr.length;
        if (arr[index - 1] == null){
            arr[index - 1] = elemento;
        }else{
            Byte[] newArr = new Byte[index + 1];
            System.arraycopy(arr,0,newArr,0,arr.length);
            arr = newArr;

            arr[index] = elemento;
        }
    }

    @Override
    public void list() {
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void remove(Byte elemento) {
        int index = encontrarIndex(elemento);
        if (index != -1){
            removeElemento(index);
        }else{
            System.out.println(ConsoleColors.RED_BOLD + "Esse elemento não foi encontrado");
        }
    }

    private void removeElemento(int index) {
        Byte[] novoArr = new Byte[arr.length - 1];
        if(index > 0){
            System.arraycopy(arr,0,novoArr,0,index);
        }
        if (index < arr.length - 1){
            System.arraycopy(arr,index+1,novoArr,index,arr.length - index - 1);
        }
        arr = novoArr;
    }

    private int encontrarIndex(Byte elemento){
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], elemento)){
                return i;
            }
        }
        return -1;
    }
}