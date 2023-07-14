package Question1;

import Question1.Main;

import java.util.Arrays;

public class MySet extends Main {
    private int[] listInt = new int[1];

    public void add(int number) {
        boolean resultadoValidacoo = validacao(number);

        if (resultadoValidacoo){
            if (listInt[listInt.length - 1] == 0){
                listInt[listInt.length - 1] = number;
            }else{
                //As proximas linhas servem apenas para aumentar o tamanho da lista
                int index = listInt.length + 1;
                int[] newListInt = new int[index];
                System.arraycopy(listInt, 0, newListInt, 0, listInt.length);
                listInt = newListInt;

                listInt[index - 1] = number;
            }
        }
    }

    private boolean validacao(int number){
        //Validando se a matriz tem mais de 100 elementos
        if (listInt.length > 100){
            System.out.println(ConsoleColors.RED_BOLD + "Sua matriz já contém mais de 100 elementos");
            return false;
        }

        //Validando se o elemento já existe na lista
        for (int i = 0; i < listInt.length; i++) {
            if (listInt[i] == number){
                System.out.println(ConsoleColors.RED_BOLD + "Esse elemento já existe dentro da Lista");
                return false;
            }
        }
        //Validando o se o novo elemento é nulo ou muito grande
        if (number == 0){
            System.out.println(ConsoleColors.WHITE_BOLD + "Esse elemento é nulo");
            return false;
        } else if (number > 10000) {
            System.out.println(ConsoleColors.RED_BOLD + "Esse número é muito grande");
            return false;
        }
        return true;
    }

    public void printArray(){
        System.out.println(" ");
        System.out.println(Arrays.toString(listInt));
        System.out.println(" ");
    }

}