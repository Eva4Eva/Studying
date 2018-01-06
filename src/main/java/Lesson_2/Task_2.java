package Lesson_2;

import java.util.Scanner;

public class Task_2 {
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

    public static void array() {
        System.out.println("Введите размер массива:");
        int lengthOfwords = sc.nextInt();

        String [] words = createwords(lengthOfwords);

        System.out.println("Слово в массиве с максимальной длиной:"
                + words[searchMaxWord(words)]);
    }
}
