/**Программа должна выполнять одно из заданий на выбор. 
*Если в консоли ввести 1 - запуститься выполнение калькулятора, 
*если 2 - поиск максимального слова в массиве.
*/

import java.util.Scanner;


public class ChoiceOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вырбрать операцию \n" +
                "если 1 - запуститься выполнение калькулятора,\n"+
                "если 2 - поиск максимального слова в массиве, \n");
        int choice = scanner.nextInt();
        switch (choice){
            case 1: Calc.calculating(); break;
            case 2: ArrayOfString.arrayOfString(); break;
        }
    }
}