//Реализовать калькулятор в стиле ООП.
//Архитектуру приложения продумать самостоятельно.


import java.util.Scanner;
public class Object_calculator {
    double number_1;
    double number_2;
    double number_3;
    public static void main(String[] args) {
        Object_calculator x = new Object_calculator();
        Object_calculator y = new Object_calculator();
        Object_calculator z = new Object_calculator();
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
