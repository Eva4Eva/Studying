package Lesson_2;

import java.util.Scanner;

import static Lesson_1.Task_1.calculator;
import static Lesson_2.Task_2.array;

public class Task_3 {

public static void choose() {
    Task_3 object = new Task_3();
    System.out.println("Введите код действия: 1-калькулятор, 2-Поиск самой длинной строки");
    Scanner enter = new Scanner(System.in);
    int choose = enter.nextInt();


    switch (choose) {

        case 1: calculator();
        break;
        case 2: array();


    }

}
}

