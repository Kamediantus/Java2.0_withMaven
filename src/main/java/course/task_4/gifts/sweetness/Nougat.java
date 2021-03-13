package course.task_4.gifts.sweetness;

import course.task_4.gifts.Sweetness;

public class Nougat extends Sweetness {

    private static String name = "Adygea Frips";
    private static double weight = 0.5;
    private static double price = 15.99;
    private String[] allTastes = new String[]{"Apple", "Orange", "Banana", "Earth", "Mango", "Tomato"};
    private String taste;

    @Override
    public String toString() {
        return "Nougat (" +
                "name = " + name  +
                ", weight = " + weight + "kg." +
                ", price = " + price + "$" +
                ", taste = " + taste + ")";
    }

    public String getTaste() {
        return taste;
    }

    public Nougat(){
        //set random taste
        taste = allTastes[(int)(Math.random()*(allTastes.length))];
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
