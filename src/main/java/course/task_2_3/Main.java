import course.task_2_3.operations.ArrayLength;
import course.task_2_3.operations.Calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hi. I can do two things:\n1. Simple calculator.\n2. Find the longest word.");
        System.out.print("Please enter 1, 2, or 3 if you disappointed in skills and want to leave: ");

        switch (in.nextInt()){
            case 1 : Calc.calculate();
            break;
            case 2 : ArrayLength.theLongestWord();
            break;
            case 3 :
                System.out.println("Good luck!");
        }
    }
}
