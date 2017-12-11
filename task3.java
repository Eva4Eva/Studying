/**
        *ѕрограмма должна выполн€ть одно из заданий на выбор.
        *≈сли в консоли ввести 1 - запуститьс€ выполнение калькул€тора,
        *если 2 - поиск максимального слова в массиве.
*/

public class ArrayOfString {

    static Scanner sc = new Scanner(System.in);

    private static String[] createMass(int n){


              String[] Mass = new String[n];


              for (int i=0; i<n; i++){


                  Mass[i] = sc.next();


                   }


               return Mass;


           }


    private static int searchFirstBigElement(String[] mas){


               int indexOfMaxLength=0;


               for (int i=0; i<mas.length; i++){


                       if (mas[indexOfMaxLength].length() < mas[i].length()) indexOfMaxLength = i;


                   }


               return indexOfMaxLength;


           }


    public static void arrayOfString() {


               System.out.println("«адать размер массива");


               int lengthOfMass = sc.nextInt();


               String [] mass = createMass(lengthOfMass);


               System.out.println("—амое длинное слово в массиве (первое, если их несколько с одинаковой длиной) "


                       + mass[searchFirstBigElement(mass)]);


           }


}