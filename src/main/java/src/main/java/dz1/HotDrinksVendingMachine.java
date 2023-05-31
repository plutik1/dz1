package src.main.java.dz1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public abstract class HotDrinksVendingMachine {

    private final List<HotDrink> list1;

    public HotDrinksVendingMachine() {
        list1 = new ArrayList<>();
    }

     void addHotDrink (HotDrink Hot) {
        list1.add(Hot);
    }

    HotDrink getHotdrink(String kind) {
        for (HotDrink Hot : list1) {
            if (kind.equals(Hot.getKind())) {
                return Hot;
            }
        }
        return null;
    }

    HotDrink getProduct(Long id) {
        for (HotDrink Hot : list1) {
            if (id.equals(Hot.getId())) {
                return Hot;
            }
        }
        return null;
    }

}
