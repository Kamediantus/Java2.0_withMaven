package course.task_5.operations;

public class Devide extends Operation{


    @Override
    public double operate(double num1, double num2) throws ArithmeticException {
        try {
            if (num2 == 0) throw new ArithmeticException("Error: devide by zero. In our world we can`t divide by zero.");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.exit(0);
        } finally {
            return num1/num2;
        }
    }
}
