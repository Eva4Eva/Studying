package Lesson_3;

import java.util.Scanner;

public class Task_1 {
    double number_1;
    double number_2;
    double number_3;
    public static void calculator_new() {
        Task_1 x = new Task_1();
        Task_1 y = new Task_1();
        Task_1 z = new Task_1();
        Scanner enter = new Scanner(System.in);
        System.out.println("Первое значение");
        x.number_1 = enter.nextDouble();
        Scanner enter_2 = new Scanner(System.in);
        System.out.println("Второе значение");
        y.number_2 = enter.nextDouble();
        z.number_3 = 0;
        String choose = new String();
        System.out.println("Символ математическоей операции");
        choose = enter_2.nextLine();
        if (choose.equals("+")) {
            z.number_3 = x.number_1 + y.number_2;
            System.out.println(z.number_3);
        } else if (choose.equals("-")) {
            z.number_3 = x.number_1 - y.number_2;
            System.out.println(z.number_3);
        } else if (choose.equals("*")) {
            z.number_3 = x.number_1 * y.number_2;
            System.out.println(z.number_3);
        } else if (choose.equals("/")) {
            z.number_3 = x.number_1 / y.number_2;
            System.out.println(z.number_3);
        } else {
            System.out.println("Ошибка!");
        }
    }
}
