package Lesson_1;

import java.util.Scanner;

import static Lesson_2.Task_2.array;
import static Lesson_2.Task_3.choose;
import static Lesson_2.Task_4.swapElements;
import static Lesson_2.Task_5.print_podarki;
import static Lesson_3.Task_1.calculator_new;
import static Lesson_4.Task_1.new_calculator;
import static Lesson_4.Task_2.file;


public class Task_1 {
    public static void calculator() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите первое значение");
        double num_1 = enter.nextDouble();
        Scanner enter_2 = new Scanner(System.in);
        System.out.println("Введите второе значение");
        double num_2 = enter.nextDouble();
        double num_3 = 0;
        String choose = new String();
        System.out.println("Введите символ математического действия");
        choose = enter_2.nextLine();
        switch (choose) {

            case "*":
                //умножение
                num_3 = num_1 * num_2;
                System.out.println(num_3);
                break;

            case "/":
                //деление
                num_3 = num_1 / num_2;
                System.out.println(num_3);
                break;

            case "+":
                //сложение
                num_3 = num_1 + num_2;
                System.out.println(num_3);
                break;


            case "-":
                //вычитание
                num_3 = num_1 - num_2;
                System.out.println(num_3);
                break;


            default:
                //любой символ, отличный от +,-,/,*
                System.out.println("Ошибка!");
        }
    }
    public static void main(String[] args){
        System.out.println("Введите номер задания от 1 до 8");
        Scanner input = new Scanner(System.in);
        String choose_1 = input.nextLine();
        switch (choose_1){

            case "1":calculator();
                break;
            case "2":array();
                break;
            case "3":choose();
                break;
            case "4":swapElements();
                break;
            case "5":print_podarki();
                break;
            case "6":calculator_new();
                break;
            case "7":new_calculator();
                break;

            case "8":file();
                break;
            default:System.out.println("Вы ввели несуществующий номер задания");



        }
    }
}
