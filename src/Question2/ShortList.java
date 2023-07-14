package Question2;

import Question1.ConsoleColors;

import java.util.Arrays;
import java.util.Objects;

public class ShortList extends Arranjo<Short> {
    private Short[] arr;
    public ShortList() {
        super(null);
        arr = new Short[1];
    }

    @Override
    public void classificar() {
        System.out.println(ConsoleColors.CYAN_BOLD + "\nEsse é um Array Short " );
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a, b) ->Short.compare(b,a));

    }

    @Override
    public void add(Short elemento) {
        int index = arr.length;
        if (arr[index - 1] == null){
            arr[index - 1] = elemento;
        }else{
            Short[] newArr = new Short[index + 1];
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
    public void remove(Short elemento) {
        int index = encontrarIndex(elemento);
        if (index != -1){
            removeElemento(index);
        }else{
            System.out.println(ConsoleColors.RED_BOLD + "Esse elemento não foi encontrado");
        }
    }

    private void removeElemento(int index) {
        Short[] novoArr = new Short[arr.length - 1];
        if(index > 0){
            System.arraycopy(arr,0,novoArr,0,index);
        }
        if (index < arr.length - 1){
            System.arraycopy(arr,index+1,novoArr,index,arr.length - index - 1);
        }
        arr = novoArr;
    }

    private int encontrarIndex(Short elemento){
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], elemento)){
                return i;
            }
        }
        return -1;
    }
}