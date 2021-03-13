package course.task_4.gifts;

import course.task_4.gifts.sweetness.ChocolateEgg;
import course.task_4.gifts.sweetness.ChupaChups;
import course.task_4.gifts.sweetness.Gummies;
import course.task_4.gifts.sweetness.Nougat;

public class NewYear {
    public static void main(String[] args) {
        Gift gift = new Gift("Kotya", true);
        gift.displayAllSweetness();
        gift.addSweetness(new ChocolateEgg());
        gift.displayAllSweetness();
        System.out.println("Total price: " + gift.getFinalPrice() + "$");
        System.out.printf("Total weigth: %.2fkg\n", gift.getFinalWeigth());

    }
}
