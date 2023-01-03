import java.util.ArrayList;
import java.util.List;

public class Stuff {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getValue() {
        float value = 0.0f;

        for (Item item : items) {
            value += item.price();
        }
        return value;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
