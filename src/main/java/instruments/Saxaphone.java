package instruments;

public class Saxaphone extends Instruments{

    public Saxaphone(String material, String color, String type) {
        super(material, color, type);
    }

    @Override
    public String play(String data) {
        return null;
    }

    @Override
    public int buyingPrice() {
        return 0;
    }

    @Override
    public int sellingPrice() {
        return 0;
    }
}
