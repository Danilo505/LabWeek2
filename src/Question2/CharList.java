package Question2;

import Question1.ConsoleColors;

import java.util.Arrays;
import java.util.Objects;

public class CharList extends Arranjo<Character> {
    private Character[] arr;

    public CharList() {
        super(null);
        arr = new Character[1];
    }

    @Override
    public void classificar() {
        System.out.println(ConsoleColors.GREEN_BOLD + "\nEsse é um Array Char");
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) ->b.compareTo(a));

    }

    @Override
    public void add(Character elemento) {
        int index = arr.length;
        if (arr[index - 1] == null){
            arr[index - 1] = elemento;
        }else{
            Character[] newArr = new Character[index + 1];
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
    public void remove(Character elemento) {
        int index = encontrarIndex(elemento);
        if (index != -1){
            removeElemento(index);
        }else{
            System.out.println(ConsoleColors.RED_BOLD + "Esse elemento não foi encontrado");
        }
    }

    private void removeElemento(int index) {
        Character[] novoArr = new Character[arr.length - 1];
        if(index > 0){
            System.arraycopy(arr,0,novoArr,0,index);
        }
        if (index < arr.length - 1){
            System.arraycopy(arr,index+1,novoArr,index,arr.length - index - 1);
        }
        arr = novoArr;
    }

    private int encontrarIndex(Character elemento){
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], elemento)){
                return i;
            }
        }
        return -1;
    }
}