package course.task_4.gifts;

// Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
//         У каждой сладости есть название, вес, цена и свой уникальный параметр.
//         Необходимо собрать подарок из сладостей. Найти общий вес подарка,
//         общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.

import course.task_4.gifts.sweetness.ChocolateEgg;
import course.task_4.gifts.sweetness.ChupaChups;
import course.task_4.gifts.sweetness.Gummies;
import course.task_4.gifts.sweetness.Nougat;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Gift {
    private double finalPrice;
    private double finalWeigth;
    private List<Sweetness> sweetnessesList;
    String nameToWhom;


    /**
     * @param nameToWhom name to whom this gift created
     * @param addAllTupesOfSweetness if True, gift will be created with all types of sweetness. Else it will be empty
     */
    public Gift(String nameToWhom, boolean addAllTupesOfSweetness) {
        sweetnessesList = new ArrayList<Sweetness>();
        this.nameToWhom = nameToWhom;
        if (addAllTupesOfSweetness) {
            this.addSweetness(new ChocolateEgg());
            this.addSweetness(new ChupaChups());
            this.addSweetness(new Gummies());
            this.addSweetness(new Nougat());
        }
    }

    public void addSweetness(Sweetness sweetness) {
        sweetnessesList.add(sweetness);
    }

    public void displayAllSweetness() {
        System.out.println("This gift was assembled for: " + nameToWhom);
        for (int i = 0; i < sweetnessesList.size(); i++) {
            if (sweetnessesList.get(i) instanceof ChocolateEgg) {
                System.out.println((i+1) + ". " + ((ChocolateEgg) sweetnessesList.get(i)).toString());
            } else if (sweetnessesList.get(i) instanceof ChupaChups) {
                System.out.println((i+1) + ". " + ((ChupaChups) sweetnessesList.get(i)).toString());
            } else if (sweetnessesList.get(i) instanceof Gummies) {
                System.out.println((i+1) + ". " + ((Gummies) sweetnessesList.get(i)).toString());
            } else if (sweetnessesList.get(i) instanceof Nougat) {
                System.out.println((i+1) + ". " + ((Nougat) sweetnessesList.get(i)).toString());
            }
        }
    }

    public double getFinalPrice(){
        for (int i = 0; i < sweetnessesList.size(); i ++){
            finalPrice += sweetnessesList.get(i).getPrice();
        }
        return finalPrice;
    }

    public double getFinalWeigth() {
        DecimalFormat decimal = new DecimalFormat();
        for (int i = 0; i < sweetnessesList.size(); i ++){
            finalWeigth += sweetnessesList.get(i).getWeight();
        }
        return finalWeigth;
    }
}