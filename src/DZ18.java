package javaapplication3;
import java.util.*;

public class DZ18 {
    public static void main(String[] args) {
        System.out.println("Введите число для умножения:  ");
        int number = new Scanner(System.in).nextInt();

        multiplicationTable(number);

    }

    static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }


    }
}