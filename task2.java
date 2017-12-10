import java.util.Scanner;
/**
 * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.
 * Размерность массива произвольна, задается в консоли. После чего в консоли 
 * вводятся слова в количестве равном заданной длине массива. В полученном 
 * массиве необходимо найти самое длинное слово. Результат вывести на консоль
 */
public class task2 {
    static Scanner sc = new Scanner(System.in);
    
    private static String[] createwords(int n){
        String[] words = new String[n];
        for (int i=0; i<n; i++){
            words[i] = sc.next();
        }
        return words;
    }

    private static int searchMaxWord(String[] words){
        int indexOfMaxLength=0;
        for (int i=0; i<words.length; i++){
            if (words[indexOfMaxLength].length() < words[i].length()) indexOfMaxLength = i;
        }
        return indexOfMaxLength;
    }
    
    public static void task2() {
        System.out.println("Введите размер массива:");
        int lengthOfwords = sc.nextInt();
        
        String [] words = createwords(lengthOfwords);
        
        System.out.println("Слово в массиве с максимальной длиной:"
                + words[searchMaxWord(words)]);
    }
}
