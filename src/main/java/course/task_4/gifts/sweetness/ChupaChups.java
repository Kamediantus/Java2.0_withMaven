package course.task_4.gifts.sweetness;

import course.task_4.gifts.Sweetness;

public class ChupaChups extends Sweetness {

    private static String name = "Sweet Chupa-Chups";
    private double weight = 0.01;
    private double price = 2.2;
    private final double LENGTH_OF_STICK = 10;

    @Override
    public String toString() {
        return "ChupaChups (" +
                "name = " + name +
                ", weight = " + weight + "kg." +
                ", price = " + price + "$" +
                ", length of stick = " + LENGTH_OF_STICK + "sm." +")";
    }

    public ChupaChups(){
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
