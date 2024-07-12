public class Jewelry extends Item implements Sellable{
    private double Carats;

    public Jewelry(String name, double weight, double Carats) {
        super(name,weight);
        this.Carats = Carats;
    }

    @Override
    public double computePrice() {
        return this.Carats * 100;
    }
}
