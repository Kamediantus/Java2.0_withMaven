package course.task_2_3.operations;

import java.util.Scanner;

public class Calc {

    /**
     * @author Sasha Rodichev, lab
     * I know about JavaDoc comments. But this programm is very short. I will use it fully in next tasks.
     * Thanks for understanding
     * */
    public static void calculate(){
        double num1;
        double num2;
        String sign;
        double result = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Hi!\nToday we will add, subtract, multiply and divide two numbers!\n" +
                "At first select sign: +, -, *, / : ");
        sign = in.next();

        switch (sign){
            case "/":System.out.print("Remember that in our world we can`t divide by zero\nEnter first number: ");
            break;
            default:System.out.print("Enter first number: ");
        }
        num1 = in.nextDouble();
        System.out.print("Enter second number: ");
        num2 = in.nextDouble();
        switch (sign){
            case "+": result = num1 + num2;
                System.out.printf("%.4f %s %.4f = %.4f", num1, sign, num2, result);
            break;
            case "-": result = num1 - num2;
                System.out.printf("%.4f %s %.4f = %.4f", num1, sign, num2, result);
            break;
            case "/": {
                if (num2 == 0) {
                    System.out.println("Ohh, i just said!");
                    break;
                }
                result = num1 / num2;
                System.out.printf("%.4f %s %.4f = %.4f", num1, sign, num2, result);
            break;
            }
            case "*": result = num1 * num2;
                System.out.printf("%.4f %s %.4f = %.4f", num1, sign, num2, result);
            break;
        }
    }
}
