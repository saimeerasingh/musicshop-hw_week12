package instruments;

public class Piano extends Instruments{

    public Piano(String material, String color, String type) {
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
