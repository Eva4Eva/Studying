//Реализовать калькулятор в стиле ООП.
//Архитектуру приложения продумать самостоятельно.


import java.util.Scanner;
public class Calculator {
    double num_1;
    double num_2;
    double num_3;
    public static void main(String[] args){

        Calculator object_1 = new Calculator();
        Calculator object_2 = new Calculator();
        Calculator object_3 = new Calculator();

Scanner input = new Scanner(System.in);
        System.out.println("Введите num_1");
 object_1.num_1=input.nextDouble();
Scanner input_2 = new Scanner(System.in);
        System.out.println("Введите num_2");
object_2.num_2=input.nextDouble();
object_3.num_3=0;
String choose = new String();
System.out.println("Введете символ математического действия");
choose=input_2.nextLine();
switch (choose){

    case "+": object_3.num_3=object_1.num_1+object_2.num_2;
    System.out.println(object_3.c);
    break;
    case  "-": object_3.num_3=object_1.num_1-object_2.num_2;
        System.out.println(object_3.num_3);
        break;
    case "*": object_3.num_3= object_1.num_1*object_2.num_2;
    System.out.println(object_3.num_3);
    break;
    case "/": object_3.num_3=object_1.num_1/object_2.num_2;
    System.out.println(object_3.num_3);
    break;
    default: System.out.println("Ошибка!Вы ввели неверный символ.");
}
    }



}
