/**
        *Программа должна выполнять одно из заданий на выбор.
        *Если в консоли ввести 1 - запуститься выполнение калькулятора,
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
               System.out.println("Размер массива");


               int lengthOfMass = sc.nextInt();


               String [] mass = createMass(lengthOfMass);


               System.out.println("Длинное слово") "


                       + mass[searchFirstBigElement(mass)]);


           }


}
