package course.task_5;

import course.task_5.operations.*;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;
        String sign;
        Scanner in = new Scanner(System.in);
        Operation operation = new Devide();

        System.out.print("Hi!\nToday we will add, subtract, multiply and divide two numbers!\n" +
                "At first select operation: +, -, *, / : ");
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
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Subtract();
                break;
            case "/":
                    operation = new Devide();
                    break;
            case "*":
                operation = new Multiply();
                break;
        }
        result = operation.operate(num1 , num2);
        System.out.printf("%.4f %s %.4f = %.4f", num1, sign, num2, result);
    }
}

