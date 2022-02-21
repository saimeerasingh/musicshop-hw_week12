package instruments;

public class Guitar extends Instruments {


    public Guitar(String material, String color, String type) {
        super(material, color, type);
    }

    @Override
    public String play(String data) {
        return "ting ting";
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
