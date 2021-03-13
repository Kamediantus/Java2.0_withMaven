package course.task_2_3.operations;

import java.util.Scanner;

public class ArrayLength {
    public static void theLongestWord(){
        Scanner in = new Scanner(System.in);
        String theLongestWord = "";
        int i = 0;

        System.out.print("Good choose! It is out new feature!\nNow enter the length of array (count of words): ");
        String[] words = new String[in.nextInt() + 1];
        System.out.println("Now enter your words one by one. Use Enter to split your words:");

        do {
            words[i] = in.next();
            i++;
        } while (i < words.length - 1);

        for (i = 0; i < words.length - 1; i++){
            if (theLongestWord.length() < words[i].length())  theLongestWord = words[i];
        }

        System.out.printf("The longest word is \"%s\" \nAnd it`s length is %d ", theLongestWord, theLongestWord.length());
    }
}
