package course.task_4;

public class RandomArray {
    public static void main(String[] args) {
        int[] rndNums = new int[20];
        int maxNegative = -10;
        int minPositive = 10;
        int maxNegativeIndex = 0;
        int minPositiveIndex = 0;


        int buffer;
        //create random elements
        for (int i = 0; i < rndNums.length; i++){
            rndNums[i] = (int)(Math.random()*22 - 11);
            System.out.print(rndNums[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < rndNums.length; i++){
            //find max negative
            if (rndNums[i] < 0 && rndNums[i] > maxNegative){
                maxNegative = rndNums[i];
                maxNegativeIndex = i;
            }
            //find min positive
            if (rndNums[i] > 0 && rndNums[i] < minPositive){
                minPositive = rndNums[i];
                minPositiveIndex = i;
            }
        }
        System.out.printf("MaxNegative: %d, MinPositive: %d\n", maxNegative, minPositive);

        //replace elements
        buffer = rndNums[minPositiveIndex];
        rndNums[minPositiveIndex] = rndNums[maxNegativeIndex];
        rndNums[maxNegativeIndex] = buffer;

        for (int i = 0; i < rndNums.length; i++){
            System.out.print(rndNums[i] + ", ");
        }
    }
}
