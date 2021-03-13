package course.task_4.gifts.sweetness;

import course.task_4.gifts.Sweetness;

public class ChocolateEgg extends Sweetness {

    private String[] allToys = new String[]{"Rabbit", "Plane", "Pistol", "Bear", "Frog", "Princess", "Dragon"};
    private static String name = "Kinder surprise";
    private static double weight = 0.45;
    private static double price = 15.99;
    private String toy;

    @Override
    public String toString() {
        return "ChocolateEgg (" +
                "name = " + name  +
                ", weight = " + weight + "kg." +
                ", price = " + price + "$" +
                ", toy = " + toy + ')';
    }

    @Override
    public double getWeight() {
        return weight;
    }
    @Override
    public double getPrice() {
        return price;
    }

    public ChocolateEgg(){
        //set random toy
        toy = allToys[(int)(Math.random()*(allToys.length))];
    }
}
