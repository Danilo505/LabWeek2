package Question1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        Scanner input = new Scanner(System.in);

        while (true) {
            int number;
            System.out.print(ConsoleColors.CYAN_BOLD + "Digite um número ");
            try {
                number = input.nextInt();
                if (number < 0) {
                    break;
                } else {
                    mySet.add(number);
                }
                mySet.printArray();
            } catch (InputMismatchException e) {
                System.out.println(ConsoleColors.RED_BOLD + "Dado invalido!");
                input.nextLine();
            }
        }
    }
}