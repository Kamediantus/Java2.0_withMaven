package course.task_5.operations;

public class Divide extends Operation{


    @Override
    public double operate(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) throw new ArithmeticException("Error: divide by zero. In our world we can`t divide by zero.");
        return num1/num2;
    }
}

