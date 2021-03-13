package course.task_4.gifts.sweetness;

import course.task_4.gifts.Sweetness;

public class Gummies extends Sweetness {

    private static String name = "Haribo";
    private static double weight = 0.15;
    private static double price = 10.5;
    private String shape;
    private String[] allShapes = new String[]{"Bear", "Fish", "Coca-Cola", "Fruits"};

    @Override
    public String toString() {
        return "Gummies (" +
                "name = " + name +
                ", weight = " + weight + "kg." +
                ", price = " + price + "$" +
                ", shape = " + shape + ")";
    }

    public Gummies(){
        //set random shape
        this.shape = allShapes[(int)(Math.random()*(allShapes.length))];
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
