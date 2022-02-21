package instruments;

import behaviours.IPlay;

public class Drums extends Instruments {

    private String drumAccessories;

    public Drums(String material, String color, String type, String drumAccessories) {
        super(material, color, type);
        this.drumAccessories = drumAccessories;

    }

    @Override
    public String play(String data) {
        return null;
    }

    public String getDrumAccessories() {
        return drumAccessories;
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
