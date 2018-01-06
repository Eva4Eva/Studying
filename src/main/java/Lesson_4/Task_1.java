package Lesson_4;

import java.util.Scanner;

public class Task_1 {
    int x;
    int y;
    int z;
    public static void new_calculator()throws ArithmeticException{

        Task_1 object_1 = new Task_1();
        Task_1 object_2 = new Task_1();
        Task_1 object_3 = new Task_1();

        Scanner input = new Scanner(System.in);
        System.out.println("x:");
        object_1.x=input.nextInt();
        Scanner input_2 = new Scanner(System.in);
        System.out.println("y:");
        object_2.x=input.nextInt();
        object_3.z=0;
        String operation = new String();
        System.out.println("Действие (+,-,*,/):");
        operation=input_2.nextLine();


        switch (operation){

            case "+": object_3.z=object_1.x+object_2.y;
                System.out.println(object_3.z);
                break;
            case  "-": object_3.z=object_1.x-object_2.y;
                System.out.println(object_3.z);
                break;
            case "*": object_3.z=object_1.x*object_2.y;
                System.out.println(object_3.z);
                break;
            case "/":
                try {
                if(object_2.y > -0.000001 && object_2.y < 0.000001)
                {
                    System.out.println("Деление на ноль!");
                } else {
                    object_3.z = object_1.x / object_2.y;
                    System.out.println(object_3.z);
                }
                } catch (ArithmeticException e){
                    System.out.println("Неизвестная арифметическая ошибка");
                }

                break;
            default: System.out.println("Неизвестное действие!! Допустимы только +,-,*,/.");
        }
    }
}
