package Question2;

import Question1.ConsoleColors;

import java.util.Arrays;
import java.util.Objects;

public class IntegerList extends Arranjo<Integer> {
    private Integer[] arr;
    public IntegerList(){
        super(null);
        arr = new Integer[1];
    }
    @Override
    public void classificar() {
        System.out.println(ConsoleColors.BLUE_BOLD + "\nEsse é um Array Int");
    }

    @Override
    public void sort() {
        Arrays.sort(arr, (a,b) -> b - a);

    }

    @Override
    public void add(Integer elemento) {
        int index = arr.length;
        if (arr[index - 1] == null){
            arr[index - 1] = elemento;
        }else{
            Integer[] newArr = new Integer[index + 1];
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
    public void remove(Integer elemento) {
        int index = encontrarIndex(elemento);
        if (index != -1){
            removeElemento(index);
        }else{
            System.out.println(ConsoleColors.RED_BOLD + "Esse elemento não foi encontrado");
        }
    }

    private void removeElemento(int index) {
        Integer[] novoArr = new Integer[arr.length - 1];
        if(index > 0){
            System.arraycopy(arr,0,novoArr,0,index);
        }
        if (index < arr.length - 1){
            System.arraycopy(arr,index+1,novoArr,index,arr.length - index - 1);
        }
        arr = novoArr;
    }

    private int encontrarIndex(Integer elemento){
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], elemento)){
                return i;
            }
        }
        return -1;
    }
}
