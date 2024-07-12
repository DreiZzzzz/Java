import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> itemList = new ArrayList<Item>();

    public Inventory() {

    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public boolean sellItem(int index) {
        if (itemList.get(index) instanceof Food || itemList.get(index) instanceof Jewelry) {
            System.out.println(itemList.get(index).getName() +  " sold for " + ((Sellable) itemList.get(index)).computePrice() + " money");
            itemList.remove(index);
            return true;
        }
        return false;
    } // why it is typecast to (Sellable) instead of (Food) or (Jewelry)

    public void displayItemInformation() {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i) instanceof Food || itemList.get(i) instanceof Jewelry) {
                System.out.println((i+1) + ". " + itemList.get(i).getName() + "(weight " + itemList.get(i).getWeight() + ")" + "(sellable)");
            } else {
                System.out.println((i+1) + ". " + itemList.get(i).getName() + "(weight " + itemList.get(i).getWeight() + ")");
            }
        }
    }

}
