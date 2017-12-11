import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
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
                num_3 = num_1 * num_2;
                System.out.println(num_3);
                break;

            case "/":
                num_3 = num_1 / num_2;
                System.out.println(num_3);
                break;

            case "+":
                num_3 = num_1 + num_2;
                System.out.println(num_3);
                break;


            case "-":
                num_3 = num_1 - num_2;
                System.out.println(num_3);
                break;


            default:
                System.out.println("Ошибка!");
        }
    }
}
