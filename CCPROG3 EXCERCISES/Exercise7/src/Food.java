public class Food extends Item implements Sellable{
    private int nutritionValue;

    public Food(String name, double weight, int nutrionValue) {
        super(name,weight);
        this.nutritionValue = nutrionValue;
    }

    @Override
    public double computePrice() {
        return this.nutritionValue * 10;
    }
}
